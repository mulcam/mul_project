package db;

public class Main {

	public static void main(String[] args) {
		
		Biz biz = new Biz();
		
		String id = "id02";
		String pwd = "pwd01";
		String name = "�̸���";
		User user = new User(id,pwd,name);
		
		try {
			biz.register(user);
			System.out.println("����");
		} catch (DuplicatedIDException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
