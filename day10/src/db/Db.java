package db;

public class Db {
	
	public void insert(User user) throws DuplicatedIDException{
		if((user.getId()).equals("id01")){
			throw new DuplicatedIDException(); // 예외면 뒷 라인은 실행 안됨
		}
		System.out.println(user);
		System.out.println("DB에 입력 완료");
	}
	
	
}
