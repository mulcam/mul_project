package ch22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 맵 {
	
	public static void main(String args[]){
		
		Map<String, User> map = new HashMap<>();
		
		User u1 = new User("id01","pwd01","이말숙");
		User u2 = new User("id02","pwd02","장말숙");
		User u3 = new User("id03","pwd03","홍말숙");
		User u4 = new User("id04","pwd04","고말숙");
		User u5 = new User("id05","pwd05","정말숙");
		
		map.put(u1.getId(), u1);
		map.put(u2.getId(), u2);
		map.put(u3.getId(), u3);
		map.put(u4.getId(), u4);
		map.put(u5.getId(), u5);
		
		//1. 아이디가 "id03"을 가지고 와라
		User user = map.get("id03");
		System.out.println(user);
		System.out.println("--------------------------------------------------");
		
		//2. 아이디가 "id04"를 삭제 하시오
		map.remove("id04");
		System.out.println("--------------------------------------------------");
		
		//3. 아이디 "id02"의 패스워드를 "a11111"로 바꾸시오
		user = map.get("id02");
		user.setPwd("a11111");
		map.put("id02", user);
		System.out.println(map.get("id02"));
		System.out.println("--------------------------------------------------");
		
		//4. 모든 데이터를 가지고 온다.
		Set<String> set = map.keySet();
		
		for(String id : set){
			User u = map.get(id);
			System.out.println(u);
		}
		
	}
	
}
