package ex;

public class Ex2 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int result = 0;
		try{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			result = a/b;
			System.out.println("��� : "+result);
		}catch(ArithmeticException e){
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("�и� 0");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�Է��ض�");
		}
		System.out.println("���α׷� ����");
	}

}
