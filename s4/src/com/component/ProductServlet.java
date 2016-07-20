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
import com.frame.product.ProductBiz;
import com.oreilly.servlet.MultipartRequest;
import com.vo.Customer;
import com.vo.Product;

@WebServlet({ "/ProductServlet", "/product" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductBiz biz;

	public ProductServlet() {
		super();
		biz = new ProductBiz();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String next = "main.jsp";

		if (cmd == null || cmd.equals("")) {

		} else if (cmd.equals("register")) {
			request.setAttribute("center", "product/register");
			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productRegister);
		} else if (cmd.equals("registerimpl")) {
			String dir = "C:\\html5\\s4\\web\\img";

			MultipartRequest mr = new MultipartRequest(request, dir, "EUC-KR");
			String name = mr.getParameter("name");
			String price = mr.getParameter("price");
			String imgname = mr.getOriginalFileName("img");

			Product p = new Product(name, Integer.parseInt(price), imgname);

			try {
				biz.register(p);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("productok", p);
			request.setAttribute("center", "product/registerok");
			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productRegister);

		} else if (cmd.equals("list")) {
			ArrayList<Object> plist = null;

			try {
				plist = biz.get();
				request.setAttribute("plist", plist);
			} catch (Exception e) {

				e.printStackTrace();
			}
			request.setAttribute("center", "product/list");
			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productList);
		} else if (cmd.equals("detail")) {
			String id = request.getParameter("id");
			Product dbp = null;

			try {
				dbp = (Product) biz.get(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(dbp);
			request.setAttribute("detailpro", dbp);
			request.setAttribute("center", "product/detail");
			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productDetail);
		} else if (cmd.equals("delete")) {
			String id = request.getParameter("id");

			try {
				biz.remove(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ArrayList<Object> plist = null;

			try {
				plist = biz.get();
				request.setAttribute("plist", plist);
			} catch (Exception e) {

				e.printStackTrace();
			}

			request.setAttribute("center", "product/list");
			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productList);
		} else if (cmd.equals("update")) {
			String id = request.getParameter("id");
			Product dbp = null;
			try {
				dbp = (Product) biz.get(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("updateproduct", dbp);
			request.setAttribute("center", "product/update");
			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productDetail);

		} else if (cmd.equals("updateimpl")) {
			String dir = "C:\\html5\\s4\\web\\img";

			MultipartRequest mr = new MultipartRequest(request, dir, "EUC-KR");
			int id = Integer.parseInt(mr.getParameter("id"));
			String name = mr.getParameter("name");
			String price = mr.getParameter("price");
			String imgname = mr.getParameter("imgname");
			String newimg = mr.getOriginalFileName("newimg");

			Product p = null;
			if (newimg == null) {
				p = new Product(id, name, Integer.parseInt(price), imgname);
			} else {
				p = new Product(id, name, Integer.parseInt(price), newimg);
			}

			// System.out.println( "updateimpl :" + p.toString());
			try {
				biz.modify(p);
				request.setAttribute("detailpro", p);
				request.setAttribute("center", "product/detail");

			} catch (Exception e) {
				e.printStackTrace();
			}

			request.setAttribute("left", "product/left");
			request.setAttribute("navi", Navi.productDetail);
		}
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}
