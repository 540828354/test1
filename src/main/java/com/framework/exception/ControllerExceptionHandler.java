package com.framework.exception;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Administrator
 * @date 2018/2/7
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public String handleFatherException(Exception e) {
        e.printStackTrace();
        return "big exception";
    }

    //测试时会优先进此方法
    @ResponseBody
    @ExceptionHandler(value = NumberFormatException.class)
    public String handleNumberFormatException(NumberFormatException e) {
        e.printStackTrace();
        return "NumberFormatException";
    }

    @ResponseBody
    @ExceptionHandler(value = StrangeException.class)
    public String handleStrangeException(HttpServletRequest request , StrangeException e) throws StrangeException{
        System.out.printf("A Strange Exception");
        //If the exception is annotated with @ResponseStatus rethrow it and let
        // the framework handle it - like the OrderNotFoundException example
        // at the start of this post.
        // AnnotationUtils is a Spring Framework utility class.
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }
        // Otherwise setup and send the user to a default error-view.
        /*ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;*/
        return "StrangeException";
    }
}
