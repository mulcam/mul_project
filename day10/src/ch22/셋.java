package ch22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class �� {
	//�ߺ� �����͸� ������� �ʴ´�.
	
	public static void main(String[] args){
		Set<Integer> set = new HashSet<>();
		
		//Lotto ��ȣ 6���� set�� �����ÿ�
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
