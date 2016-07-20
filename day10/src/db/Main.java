package db;

public class Main {

	public static void main(String[] args) {
		
		Biz biz = new Biz();
		
		String id = "id02";
		String pwd = "pwd01";
		String name = "ÀÌ¸»¼÷";
		User user = new User(id,pwd,name);
		
		try {
			biz.register(user);
			System.out.println("Á¤»ó");
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
