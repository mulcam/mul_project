package db;

public class Db {
	
	public void insert(User user) throws DuplicatedIDException{
		if((user.getId()).equals("id01")){
			throw new DuplicatedIDException(); // ���ܸ� �� ������ ���� �ȵ�
		}
		System.out.println(user);
		System.out.println("DB�� �Է� �Ϸ�");
	}
	
	
}
