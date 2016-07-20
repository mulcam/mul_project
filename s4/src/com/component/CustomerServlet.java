package com.component;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dispatcher.Navi;
import com.dispatcher.Util;
import com.frame.customer.CustomerBiz;
import com.vo.Customer;

@WebServlet({ "/CustomerServlet", "/customer" })
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerBiz biz = null;

	public CustomerServlet() {
		super();
		biz = new CustomerBiz();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String next = "main.jsp";

		if (cmd == null || cmd.equals("")) {
			next = "main.jsp";
		} else if (cmd.equals("register")) {
			request.setAttribute("center", "customer/register");
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerRegister);
		} else if (cmd.equals("registerimpl")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			name = Util.convertKr(name);
			Customer c = new Customer(id, pwd, name);
			try {
				biz.register(c);
				request.setAttribute("customerok", c);
				request.setAttribute("center", "customer/registerok");

			} catch (Exception e) {
				request.setAttribute("center", "customer/registerfail");
				e.printStackTrace();
			}
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerRegister);
		} else if (cmd.equals("list")) {
			ArrayList<Object> clist = null;

			try {
				clist = biz.get();
				request.setAttribute("clist", clist);
			} catch (Exception e) {

				e.printStackTrace();
			}
			request.setAttribute("center", "customer/list");
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerList);
		} else if (cmd.equals("detail")) {
			String id = request.getParameter("id");
			Customer dbc = null;

			try {
				dbc = (Customer) biz.get(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("detailcust", dbc);
			request.setAttribute("center", "customer/detail");
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerDetail);
		} else if (cmd.equals("delete")) {
			String id = request.getParameter("id");

			try {
				biz.remove(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ArrayList<Object> clist = null;

			try {
				clist = biz.get();
				request.setAttribute("clist", clist);
			} catch (Exception e) {

				e.printStackTrace();
			}

			request.setAttribute("center", "customer/list");
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerList);
		} else if (cmd.equals("update")) {
			String id = request.getParameter("id");
			Customer dbc = null; 
			try {
				dbc = (Customer) biz.get(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("updatecust", dbc);
			request.setAttribute("center", "customer/update");
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerDetail);

		} else if (cmd.equals("updateimpl")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			name = Util.convertKr(name);
			Customer c = new Customer(id, pwd, name);
			//System.out.println( "updateimpl :"  + c.toString());
			try {
				biz.modify(c);
				request.setAttribute("detailcust", c);
				request.setAttribute("center", "customer/detail");

			} catch (Exception e) {
				e.printStackTrace();
			}
			request.setAttribute("left", "customer/left");
			request.setAttribute("navi", Navi.customerDetail);
		}

		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}
