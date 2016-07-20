package ws;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> map1 = new HashMap<>();
		Map<Integer, Integer> map2 = new HashMap<>();
		Random r = new Random();
		
		for(int i=1; i<=10; i++){
			map1.put(i, r.nextInt(9));
			map2.put(i, r.nextInt(9));
		}
		
		System.out.println("Ű��\tù��° HashMap\t�ι�° HashMap\t���");
		for(int i=1; i<=10; i++){
			System.out.print(i+"\t");
			System.out.print(map1.get(i)+"\t\t");
			System.out.print(map2.get(11-i)+"\t\t");
			try{
				System.out.println(map1.get(i)/map2.get(11-i));
			}catch(ArithmeticException e){
				System.out.println("�и� 0�Դϴ�.");
			}
		}
		
		
		for(int i=1; i<=10; i++){
			System.out.print(map1.get(i)+"/"+map2.get(11-i)+" ");
			try{
				System.out.println(map1.get(i)/map2.get(11-i));
			}catch(ArithmeticException e){
				System.out.println("�и� 0�Դϴ�.");
			}
		}
		
		
		
		
	}

}
