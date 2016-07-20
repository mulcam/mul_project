package ch22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class �� {
	
	public static void main(String args[]){
		
		Map<String, User> map = new HashMap<>();
		
		User u1 = new User("id01","pwd01","�̸���");
		User u2 = new User("id02","pwd02","�帻��");
		User u3 = new User("id03","pwd03","ȫ����");
		User u4 = new User("id04","pwd04","����");
		User u5 = new User("id05","pwd05","������");
		
		map.put(u1.getId(), u1);
		map.put(u2.getId(), u2);
		map.put(u3.getId(), u3);
		map.put(u4.getId(), u4);
		map.put(u5.getId(), u5);
		
		//1. ���̵� "id03"�� ������ �Ͷ�
		User user = map.get("id03");
		System.out.println(user);
		System.out.println("--------------------------------------------------");
		
		//2. ���̵� "id04"�� ���� �Ͻÿ�
		map.remove("id04");
		System.out.println("--------------------------------------------------");
		
		//3. ���̵� "id02"�� �н����带 "a11111"�� �ٲٽÿ�
		user = map.get("id02");
		user.setPwd("a11111");
		map.put("id02", user);
		System.out.println(map.get("id02"));
		System.out.println("--------------------------------------------------");
		
		//4. ��� �����͸� ������ �´�.
		Set<String> set = map.keySet();
		
		for(String id : set){
			User u = map.get(id);
			System.out.println(u);
		}
		
	}
	
}
