package ex;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex4 {

	public static void main(String[] args) {
		// ������ �����Ѵ�.
		Socket socket = null;
		try {
			socket = new Socket("127.0.0.1",80);
			socket.getOutputStream().write(100);
			System.out.println("����");
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null){
					socket.close();
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("�׻� ����");
		}
		
		System.out.println("����");
		
	}

}
