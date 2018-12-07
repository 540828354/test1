package com.framework.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 *
 * @author Administrator
 * @date 2018/1/30
 */
public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.print("do post method");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.print("do get method");
        Enumeration<String> es = getServletConfig().getInitParameterNames();
        while (es.hasMoreElements()) {
            System.out.println(es.nextElement());
            System.out.println(getInitParameter(es.nextElement()));
        }
    }
}
