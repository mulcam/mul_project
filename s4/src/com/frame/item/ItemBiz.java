package com.frame.item;

import java.util.ArrayList;

import com.frame.frame.Biz;
import com.frame.frame.DAO;

public class ItemBiz implements Biz {
	private DAO dao;

	public ItemBiz() {
		dao = new ItemDAO();
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
