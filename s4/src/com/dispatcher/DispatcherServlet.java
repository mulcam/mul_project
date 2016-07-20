package com.dispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.test.TestServlet;

@WebServlet({ "/DispatcherServlet", "/dispather" })
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = Logger.getLogger(DispatcherServlet.class);
	
	public DispatcherServlet() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();
		String path = uri.substring(uri.lastIndexOf('/'));
		log.debug(path);
		
		path = path.substring(1, path.lastIndexOf("."));
		String next = "main.jsp";

		if (path.equals("main")) {

			String view = request.getParameter("view");

			// login 夸没矫 其捞瘤 贸府
			if (view != null) {
				build(request, view);
			}
			next = "main.jsp";
		} else {
			next = path;
		}

		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);

	}

	private void build(HttpServletRequest request, String view) {
		if (view.equals("login")) {
			request.setAttribute("center", view);
			request.setAttribute("navi", Navi.login);
		} else if (view.equals("register")) {
			request.setAttribute("center", view);
			request.setAttribute("left", view + "_left");
			request.setAttribute("navi", Navi.register);
		} else if (view.equals("about")) {
			request.setAttribute("center", view);
			request.setAttribute("left", view + "_left");
			request.setAttribute("navi", Navi.about);
		} else if (view.equals("customer")) {
			request.setAttribute("center", view + "/center");
			request.setAttribute("left", view + "/left");
			request.setAttribute("navi", Navi.customer);
		} else if (view.equals("product")) {
			request.setAttribute("center", view + "/center");
			request.setAttribute("left", view + "/left");
			request.setAttribute("navi", Navi.product);
		} else if (view.equals("item")) {
			request.setAttribute("center", view + "/center");
			request.setAttribute("left", view + "/left");
			request.setAttribute("navi", Navi.item);
		}
	}

}
