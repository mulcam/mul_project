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
import com.frame.item.ItemBiz;
import com.oreilly.servlet.MultipartRequest;
import com.vo.Item;


@WebServlet({ "/ItemServlet", "/item" })
public class ItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ItemBiz biz;

	public ItemServlet() {
		super();
		biz = new ItemBiz();
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String next = "main.jsp";

		if (cmd == null || cmd.equals("")) {

		} else if (cmd.equals("register")) {
			request.setAttribute("center", "item/register");
			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemRegister);
		} else if (cmd.equals("registerimpl")) {
			String dir = "C:\\html5\\s4\\web\\img";

			MultipartRequest mr = new MultipartRequest(request, dir, "EUC-KR");
			String name = mr.getParameter("name");
			String price = mr.getParameter("price");
			String imgname1 = mr.getOriginalFileName("img1");
			String imgname2 = mr.getOriginalFileName("img2");

			Item i = new Item(name, Integer.parseInt(price), imgname1, imgname2);

			try {
				biz.register(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("itemok", i);
			request.setAttribute("center", "item/registerok");
			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemList);

		} else if (cmd.equals("list")) {
			ArrayList<Object> ilist = null;

			try {
				ilist = biz.get();
				request.setAttribute("ilist", ilist);
			} catch (Exception e) {

				e.printStackTrace();
			}
			request.setAttribute("center", "item/list");
			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemList);
		} else if (cmd.equals("detail")) {
			String id = request.getParameter("id");
			Item dbi = null;

			try {
				dbi = (Item) biz.get(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// System.out.println(dbp);
			request.setAttribute("detailitem", dbi);
			request.setAttribute("center", "item/detail");
			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemDetail);
		} else if (cmd.equals("delete")) {
			String id = request.getParameter("id");

			try {
				biz.remove(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ArrayList<Object> ilist = null;

			try {
				ilist = biz.get();
				request.setAttribute("ilist", ilist);
			} catch (Exception e) {

				e.printStackTrace();
			}

			request.setAttribute("center", "item/list");
			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemList);
		} else if (cmd.equals("update")) {
			String id = request.getParameter("id");
			Item dbi = null;
			try {
				dbi = (Item) biz.get(id);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("updateitem", dbi);
			request.setAttribute("center", "item/update");
			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemDetail);

		} else if (cmd.equals("updateimpl")) {
			String dir = "C:\\html5\\s4\\web\\img";

			MultipartRequest mr = new MultipartRequest(request, dir, "EUC-KR");
			String id =mr.getParameter("id");
			String name = mr.getParameter("name");
			String price = mr.getParameter("price");
			String imgname1 = mr.getParameter("img1");
			String imgname2 = mr.getParameter("img2");
			String newimg1 = mr.getOriginalFileName("newimg1");
			String newimg2 = mr.getOriginalFileName("newimg2");
			String date = mr.getParameter("date");
			
			if (newimg1 == null) newimg1 = imgname1;
					
			if (newimg2 == null) newimg2 = imgname2;
						
			Item i = new Item (id, name, Integer.parseInt(price), newimg1, newimg2, date);
			
			System.out.println( "updateimpl :" + i.toString());
			try {
				biz.modify(i);
				request.setAttribute("detailitem", i);
				request.setAttribute("center", "item/detail");

			} catch (Exception e) {
				e.printStackTrace();
			}

			request.setAttribute("left", "item/left");
			request.setAttribute("navi", Navi.itemDetail);
		}
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
	}

}
