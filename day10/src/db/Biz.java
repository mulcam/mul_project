package db;

public class Biz {
	
	Db db;
	
	public Biz(){
		db = new Db();
	}
	
	public void register(User user) throws DuplicatedIDException{
		db.insert(user);
	}
	
}
