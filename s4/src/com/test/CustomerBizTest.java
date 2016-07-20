package com.test;

import java.util.ArrayList;

import com.frame.customer.CustomerBiz;
import com.frame.frame.Biz;
import com.vo.Customer;


public class CustomerBizTest {

	public static void main(String[] args) {
		Biz biz = new CustomerBiz();
		String id = "id24";
		String pwd = "pwd05";
		String name = "황말자";
		Customer c = new Customer(id, pwd, name);
		ArrayList<Object> list = new ArrayList<>();

		try {
			biz.register(c);
			System.out.println("Register OK");
			c = (Customer) biz.get(id);
			System.out.println(c.toString());
			System.out.println("Get OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			pwd = "Update";
			name = "업말자";
			biz.modify((new Customer(id, pwd, name)));
			System.out.println("Modify OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			c = (Customer) biz.get(id);
			System.out.println(c.toString());
			System.out.println("Get OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			biz.remove(id);
			System.out.println("Remove OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			list = biz.get();
			for (Object cust : list) {
				System.out.println(cust);
			}
			System.out.println("Get ALL OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Program End");

	}

}
