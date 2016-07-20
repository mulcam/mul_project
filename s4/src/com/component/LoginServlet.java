package com.component;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dispatcher.Navi;
import com.frame.customer.CustomerBiz;
import com.vo.Customer;

@WebServlet({ "/LoginServlet", "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerBiz biz;

	public LoginServlet() {
		super();
		biz = new CustomerBiz();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session != null) {
			session.invalidate();
		}
		response.sendRedirect("main.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String next = "main.jsp";

		Customer dbc = null;
		try {
			dbc = (Customer) biz.get(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		/* ID/PWD ºñ±³ */
		if (dbc != null && dbc.getPwd().equals(pwd)) {
			request.setAttribute("center", "loginok");
			request.setAttribute("navi", Navi.login);
			HttpSession session = request.getSession();
			session.setAttribute("logincustomer", dbc);
		} else {
			request.setAttribute("center", "loginfail");
			request.setAttribute("navi", Navi.login);
		}

		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}
