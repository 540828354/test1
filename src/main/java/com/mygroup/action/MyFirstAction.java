package com.mygroup.action;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.framework.exception.StrangeException;
import com.mygroup.model.request.BaseRequest;
import com.mygroup.model.response.Response;
import com.mygroup.model.vo.Book;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author me
 * Created by Administrator on 2018/1/10.
 */
@Controller
@RequestMapping("/first")
public class MyFirstAction {
    /*public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/main/resources/WEB-INF/applicationContext.xml");
        NintendoImpl nintendoImpl = (NintendoImpl) context.getBean("NintendoImpl");
        nintendoImpl.saySomething();
    }*/

    @RequestMapping("/say")
    public String nintendoSay(HttpServletRequest request, BaseRequest baseRequest) {
        String a = request.getParameter("name");
        System.out.println(baseRequest.getName());
        return "nintendo";
    }

    //the parameter was converted in initBinder
    @RequestMapping("/showDate")
    public String date(Date date){
        System.out.println(date);
        return "nintendo";
    }

    //At the time of initialization,convert the type "String" to type "date"
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }

    @RequestMapping("/play")
    public String nintendoPlay(HttpServletRequest request, BaseRequest baseRequest, @RequestParam(value = "where" ,required = false,defaultValue = "haha") String whereAreYou) {
        System.out.println(whereAreYou);
        return "nintendo";
    }

    @RequestMapping(value = "/viewPrice/{gameName}", method = RequestMethod.GET)
    public String viewPrice(HttpServletRequest request, HttpServletResponse response, @PathVariable("gameName") String gameName) {
        Integer price = gameName.hashCode() % 500;
        request.setAttribute("price",price);
        System.out.println(request);
        return "nintendo";
    }

    // 十三
    // 通过适当的HttpMessageConverter(MappingJackson2HttpMessageConverter)转换为指定格式后，写入到Response对象的body数据区
    @ResponseBody
    @RequestMapping("/getBook")
    public Response<Book> getBook() {
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter();
        System.out.println(defaultPrettyPrinter.toString());
        Response<Book> response = new Response<>();
        Book book = new Book();
        book.setBookAuthor("a");
        book.setBookPrice(12.3);
        book.setBookName("b");
        response.setContent(book);
        response.setCode("1");
        return response;
    }

    //十四  被ControllerExceptionHandler处理全局异常
    @ResponseBody
    @RequestMapping(value = "/exceptionHandle/{number}", method = RequestMethod.GET)
    public Response HandleControllerException(HttpServletRequest request, @PathVariable("number") String numberStr) throws StrangeException{
        Response<Integer> response = new Response<>();
        Integer number = Integer.valueOf(numberStr);
        response.setContent(number);
        response.setCode("1");
        if (number == 7) {
            throw new StrangeException("strange");
        }
        System.out.println(request);
        return response;
    }

    //局部异常处理 只处理该controller
//    @ResponseBody
//    @ExceptionHandler
//    public ModelAndView exceptionHandler(Exception ex){
//        ModelAndView mv = new ModelAndView("error");
//        mv.addObject("exception", ex);
//        System.out.println("in testExceptionHandler");
//        return mv;
//    }

}
