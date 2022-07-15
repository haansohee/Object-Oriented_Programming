package week5;

public class Continue {

	public static void main(String[] args) {
		// 1~100 까지의 숫자 중 짝수만 출력하는 프로그램
		
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
