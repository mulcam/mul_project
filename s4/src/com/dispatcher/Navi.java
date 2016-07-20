package com.dispatcher;

public class Navi {

	public static String home = "<a href='main.mul'>HOME</a>";
	public static String login = home + " > <a href='main.mul?view=login'>LOGIN</a>";
	public static String register = home + " > <a href='main.mul?view=register'>REGISTER</a>";
	public static String about = home + " > <a href='main.mul?view=about'>ABOUT</a>";

	public static String customer = home + " > <a href='main.mul?view=customer'>CUSTOMER</a>";
	public static String customerRegister = customer + " > <a href='customer.mul?cmd=register'>REGISTER</a>";
	public static String customerList = customer + " > <a href='customer.mul?cmd=list'>LIST</a>";
	public static String customerDetail = customer + " > DETAIL";
	public static String product = home + " > <a href='main.mul?view=product'>PRODUCT</a>";
	public static String productRegister = product + " > <a href='product.mul?cmd=register'>REGISTER</a>";
	public static String productList = product + " > <a href='product.mul?cmd=list'>LIST</a> ";
	public static String productDetail = product + " > DETAIL";
	public static String item = home + " > <a href='main.mul?view=item'>ITEM</a>";
	public static String itemRegister = item + " > <a href='item.mul?cmd=register'>REGISTER</a>";
	public static String itemList = item + " > <a href='item.mul?cmd=list'>LIST</a>";
	public static String itemDetail = item + " > DETAIL";

}
