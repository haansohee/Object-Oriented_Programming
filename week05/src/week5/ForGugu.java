package week5;

public class ForGugu {

	public static void main(String[] args) {
		// 2��~9�� ����ϱ�
		
		for (int i = 2; i < 10; i++)
		{
			System.out.println("===============");
			System.out.println("������ : " + i + "��");
			System.out.println("===============");
			
			for (int j = 1; j < 10; j++)
			{
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}

	}

}
