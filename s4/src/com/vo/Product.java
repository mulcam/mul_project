package com.vo;

public class Product {
	private int id;
	private String name;
	private int price;
	private String imgname;

	public Product(int id, String name, int price, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}
	
	public Product(String name, int price, String imgname) {
		this.name = name;
		this.price = price;
		this.imgname = imgname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImgname() {
		return imgname;
	}

	public void setImg(String imgname) {
		this.imgname = imgname;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", imgname=" + imgname + "]";
	}

}
