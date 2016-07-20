package com.frame.customer;

import java.util.ArrayList;

import com.frame.frame.Biz;
import com.frame.frame.DAO;

public class CustomerBiz implements Biz {
	private DAO dao;

	public CustomerBiz() {
		dao = new CustomerDAO();
	}

	@Override
	public void register(Object obj) throws Exception {
		dao.insert(obj);
	}

	@Override
	public void remove(Object obj) throws Exception {
		dao.delete(obj);
	}

	@Override
	public void modify(Object obj) throws Exception {
		System.out.println( "customerbiz :"  + obj);
		dao.update(obj);

	}

	@Override
	public Object get(Object obj) throws Exception {
		return dao.select(obj);
	}

	@Override
	public ArrayList<Object> get() throws Exception {
		return dao.select();
	}

}
