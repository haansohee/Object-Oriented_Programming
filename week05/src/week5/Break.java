package week5;

public class Break {

	public static void main(String[] args) {
		// 0~9������ ���� ���� �� 7�� ������ ���α׷� ����
		
		while (true) 
		{
			int num = (int)(Math.random() * 10);
			
			System.out.println("���� ���� : " + num);
			
			if (num == 7)
				break;
		}

	}
}
