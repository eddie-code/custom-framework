package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author eddie.lee
 * @ProjectName custom-framework
 * @Package com.example
 * @ClassName HelloServlet
 * @blog blog.eddilee.cn
 * @description
 * @date created in 2021-09-14 21:42
 * @modified by
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		String name = "Eddie.Lee";
		req.setAttribute("name", name);
		req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
	}
}
