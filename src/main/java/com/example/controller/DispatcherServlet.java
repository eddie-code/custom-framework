package com.example.controller;

import com.example.controller.frontend.MainPageController;
import com.example.controller.superadmin.HeadLineOperationController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example.controller
 * @ClassName DispatcherSevlet
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-15 18:07
 * @modified by
 */
@WebServlet("/")
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request path = " + request.getServletPath());
        System.out.println("request method = " + request.getMethod());
        if (request.getServletPath() == "/frontend/getmainpageinfo" && request.getMethod() == "GET") {
            new MainPageController().getMainPageInfo(request,response);
        }else if(request.getServletPath() == "/superadmin/addheadline" && request.getMethod() == "POST") {
            new HeadLineOperationController().addHeadLine(request,response);
        }

    }
}
