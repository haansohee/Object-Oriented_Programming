package week4;

import java.io.IOException;

public class KeyControl {

	public static void main(String[] args) throws IOException {
		int keyCode = 0;
		
		System.out.println("���� �Է��ֿ���");
		
		keyCode = System.in.read();
		
		System.out.println("�Էµ� �� : " + keyCode);

	}

}
