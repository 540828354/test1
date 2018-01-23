package main.java.com.mygroup.action;

import main.java.com.mygroup.seviceimpl.NintendoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/1/10.
 */
public class MyFirstAction {
    public static void main(String args[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/main/resources/WEB-INF/applicationContext.xml");
        NintendoImpl nintendoImpl = (NintendoImpl) context.getBean("NintendoImpl");
        nintendoImpl.saySomething();
    }
}
