package com.frame.frame;

import java.util.ArrayList;

public interface Biz {

	public void register(Object obj) throws Exception;

	public void remove(Object obj) throws Exception;

	public void modify(Object obj) throws Exception;

	public Object get(Object obj) throws Exception;

	public ArrayList<Object> get() throws Exception;

}
