package week5;

import java.io.IOException;

public class KeyControl2 {

	public static void main(String[] args) throws IOException {
		int keyCode = 0;
		int count = 0;
		boolean run = true;
		
		System.out.println("���ڸ� �Է��ϼ���. (0~9)");
		
		while(run)
		{
			
			keyCode = System.in.read();
			
			if (keyCode != 13 && keyCode != 10) 
			{
				System.out.println("�Է��� ����" + (char)keyCode + "�Դϴ�.");
				System.out.println("���ڸ� �Է��ϼ���.(0~9)");
				
				count++;
				if (count > 5) {
					run = false;
				}
				
			}
			
			// System.out.println("�Էµ� �� : " + keyCode);
			
			// Ű����� ���� �Է¹��� ������ ī��Ʈ�ؼ� �ټ� ���� �Է¹����� ������������ ��
			// count ++;
			// System.out.println("count = " + count);
			
			/* if (count > 5)
			{
				run = false;
			} */ 
		}
		System.out.println("���α׷� ����");

	}

}
