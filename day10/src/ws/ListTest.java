package ws;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {

	public static void main(String[] args) {

		Random r = new Random();
		List list = new ArrayList();
		
		for(int i=0; i<10; i++){
			list.add(r.nextInt(10)+1);
		}
		
		for(Object obj : list){
			int i = (Integer)obj;
			System.out.print(i+" ");
		}
		System.out.println();
		
		list.sort(null);
		
		for(Object obj : list){
			int i = (Integer)obj;
			System.out.print(i+" ");
		}

	}

}
