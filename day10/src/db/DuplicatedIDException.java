package db;

public class DuplicatedIDException extends Exception {
	public DuplicatedIDException(){
		super("id가 중복입니다.");
	}
}
