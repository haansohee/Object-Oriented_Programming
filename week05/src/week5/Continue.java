package week5;

public class Continue {

	public static void main(String[] args) {
		// 1~100 ������ ���� �� ¦���� ����ϴ� ���α׷�
		
		for (int i = 1; i <= 100; i++) 
		{
			if ((i % 2) != 0) 
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
