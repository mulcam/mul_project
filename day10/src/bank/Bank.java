package bank;

public class Bank {

	public static void main(String[] args) {
		
		Account a = new Account(10000);
		try {
			a.withdraw(2000);
			a.deposit(-10000);
			System.out.println(a);			
		} catch (NotEnoughException e) {
			//e.printStackTrace();
			if(e.getMessage().equals("AQ10000")){
				System.out.println("잔액이 부족합니다.");
			}
		} catch (MinusMoneyException e) {
			System.out.println(e.getMessage());
		}

	}

}
