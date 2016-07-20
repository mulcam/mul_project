package com.test;

import java.util.ArrayList;

import com.frame.frame.Biz;
import com.frame.item.ItemBiz;
import com.vo.Item;


public class ItemBizTest {

	public static void main(String[] args) {
		Biz biz = new ItemBiz();
		String name = "테스트 상품";
		String id = "";
		int price = 1000;
		String imgName1 = "testImg1.png";
		String imgName2 = "testImg2.png";
		
		Item i = new Item(name, price, imgName1, imgName2);
		ArrayList<Object> list = new ArrayList<>();

		try {
			biz.register(i);
			System.out.println("Register OK");
			id = "20160712127";
			i = (Item) biz.get(id);
			System.out.println(i.toString());
			System.out.println("Get OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			imgName1 = "UpdateIMG1.png";
			imgName2 = "UpdateIMG2.png";
			name = "업상품";
			biz.modify((new Item(id, name, price, imgName1, imgName2, i.getRegDate())));
			System.out.println("Modify OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			i = (Item) biz.get(id);
			System.out.println(i.toString());
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
			for (Object item : list) {
				System.out.println(item);
			}
			System.out.println("Get ALL OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Program End");

	}

}
