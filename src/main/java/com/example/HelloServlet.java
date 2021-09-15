package com.example;

import com.example.pojo.bo.HeadLine;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@Slf4j
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

//	Logger log = LoggerFactory.getLogger(HttpServlet.class);


	@Override
	public void init() {
		System.out.println("初始化Servlet...");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("是我执行了doGet(), this is entry");
		doGet(req,resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		super.doGet(req, resp);
		String name = "Eddie.Lee";
		log.debug("String name = " + name);
		req.setAttribute("name", name);
		req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("销毁...");
	}
}
