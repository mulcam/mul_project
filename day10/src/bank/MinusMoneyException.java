package bank;

public class MinusMoneyException extends Exception {
	
	public MinusMoneyException(){
		super("�Ա� ����");
	}

	public MinusMoneyException(String m){
		super(m);
	}
}
