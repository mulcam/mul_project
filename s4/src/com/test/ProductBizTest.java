package com.test;

import java.util.ArrayList;

import com.frame.frame.Biz;
import com.frame.product.ProductBiz;
import com.vo.Customer;
import com.vo.Product;


public class ProductBizTest {

	public static void main(String[] args) {
		Biz biz = new ProductBiz();
		String name = "테스트 상품";
		int id = 0;
		int price = 1000;
		String imgName = "testImg.png";
		
		Product p = new Product(name, price, imgName);
		ArrayList<Object> list = new ArrayList<>();

		try {
			biz.register(p);
			System.out.println("Register OK");
			id = 113;
			p = (Product) biz.get(id);
			System.out.println(p.toString());
			System.out.println("Get OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			imgName = "UpdateIMG.png";
			name = "업상품";
			biz.modify((new Product(id, name, price, imgName)));
			System.out.println("Modify OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			p = (Product) biz.get(id);
			System.out.println(p.toString());
			System.out.println("Get OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			biz.remove(id);
			System.out.println("Remove OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			list = biz.get();
			for (Object product : list) {
				System.out.println(product);
			}
			System.out.println("Get ALL OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Program End");

	}

}
