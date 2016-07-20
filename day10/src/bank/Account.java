package bank;

public class Account {
	
	private int balance;

	public Account() {
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) throws MinusMoneyException{
		if(money < 0){
			throw new MinusMoneyException("음수 입니다.");
		}
		balance += money;
	}
	
	public void withdraw(int money) throws NotEnoughException , MinusMoneyException{
		if(money < 0){
			throw new MinusMoneyException("음수 입니다.");
		}
		if(balance < money){
			throw new NotEnoughException();
		}
		balance -= money;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
	
}
