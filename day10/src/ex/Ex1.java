package ex;

public class Ex1 {

	public static void main(String[] args) {

		String s = null;
		int a = 0;
		int b = 0;
		int result = 0;
		try{
			s = args[1];
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			s = "asdf";
		}
		
		System.out.println(s);
		
		
//		int a[] = {1,2,3,4,5};
//		for (int i = 0; i <= a.length; i++) {
//			System.out.println(a[i]);			
//		}
		
	}

}
