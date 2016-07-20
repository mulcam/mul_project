package ch22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class 셋 {
	//중복 데이터를 허용하지 않는다.
	
	public static void main(String[] args){
		Set<Integer> set = new HashSet<>();
		
		//Lotto 번호 6개를 set에 넣으시오
		Random ran = new Random();
		while(set.size()<6){
			set.add(ran.nextInt(45)+1);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+ " ");
		}
			
	}

}
