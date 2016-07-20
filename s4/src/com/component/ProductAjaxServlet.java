package com.component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.frame.product.ProductBiz;
import com.vo.Product;

@WebServlet({ "/ProductAjaxServlet", "/productajax" })
public class ProductAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductBiz biz;

	public ProductAjaxServlet() {
		super();
		biz = new ProductBiz();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if (cmd.equals("all")) {
			ArrayList<Object> list = null;
			try {
				list = biz.get();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			JSONArray ja = new JSONArray();
			for (Object obj : list) {
				Product p = (Product) obj;
				JSONObject jo = new JSONObject();
				jo.put("id", p.getId());
				jo.put("name", p.getName());
				jo.put("price", p.getPrice());
				jo.put("imgname", p.getImgname());
				ja.add(jo);
			}
			response.setContentType("text/json;charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.print(ja.toJSONString());
			out.close();
		} else if (cmd.equals("w")) {
			String str = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22seoul%22)%20%20and%20u%3D%27c%27&format=xml&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
			URL url = new URL(str);
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			StringBuffer sb = new StringBuffer();
			String temp = null;
			while (true) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				sb.append(temp);
			}
			response.setContentType("text/xml;charset=euc-kr");
			PrintWriter out = response.getWriter();
			out.print(sb.toString());
			out.close();
		}
	}

}
