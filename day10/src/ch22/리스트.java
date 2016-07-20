package ch22;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class 리스트 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("234");
		list.add("cgv");
		list.add("456");
		System.out.println(list.contains("a"));
		System.out.println(list.contains("456")); //456이 존재하는가
		System.out.println(list.indexOf("234")); //234가 몇번째 있나
		
		for(String obj :list){
			System.out.println(obj.toUpperCase());
		}
		
		System.out.println("---------------------------------------------------------");
		//메모리 구조에서 퍼져있는 데이터를 모아주기 때문에
		//한꺼번에 많은 데이터를 처리할때 빠르다.
		Iterator<String> it = list.iterator(); //
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("---------------------------------------------------------");
		
		List<Apple> alist = new LinkedList<>();
		alist.add(new Apple(10));
		alist.add(new Apple(20));
		alist.add(new Apple(30));
		alist.add(new Apple(40));
		alist.add(new Apple(50));
		alist.add(new Apple(60));
		alist.add(new Apple(70));
		alist.add(new Apple(80));
		
		Thread tr = new Thread(); 
		for(Apple ap : alist){
			try {
				tr.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(ap.toString());
		}
		
		
		
		
		
		
		
		
	}

}
