package com.vo;

public class Item {
	private String id;
	private String name;
	private int price;
	private String imgname1;
	private String imgname2;
	private String regDate;

	public Item(String id, String name, int price, String imgname1, String imgname2, String regDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.imgname1 = imgname1;
		this.imgname2 = imgname2;
		this.regDate = regDate;
	}

	public Item(String name, int price, String imgname1, String imgname2) {
		super();
		this.name = name;
		this.price = price;
		this.imgname1 = imgname1;
		this.imgname2 = imgname2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getImgname1() {
		return imgname1;
	}

	public void setImgname1(String imgname1) {
		this.imgname1 = imgname1;
	}

	public String getImgname2() {
		return imgname2;
	}

	public void setImgname2(String imgname2) {
		this.imgname2 = imgname2;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "item [id=" + id + ", name=" + name + ", price=" + price + ", imgname1=" + imgname1 + ", imgname2="
				+ imgname2 + ", regDate=" + regDate + "]";
	}

}
