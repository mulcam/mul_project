package ws;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String args[]){
		
		Random r = new Random();
		HashMap map = new HashMap();
		double sum = 0.0;
		
		for(int i=1; i<=10; i++){
			map.put(i, r.nextInt(100)+1);
		}
		
		Set<Integer> set = map.keySet();
		for(int i : set){
			System.out.print(map.get(i)+" ");
			sum += (int)map.get(i);
		}
		System.out.println();
		
		for(int i : set){
			sum += (int)map.get(i);
		}
		System.out.printf("ÇÕ°è : %5.2f\n",sum);
		System.out.printf("Æò±Õ : %5.2f",sum/set.size());
	}
	
}
