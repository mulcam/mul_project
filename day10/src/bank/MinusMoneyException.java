package bank;

public class MinusMoneyException extends Exception {
	
	public MinusMoneyException(){
		super("입금 오류");
	}

	public MinusMoneyException(String m){
		super(m);
	}
}
