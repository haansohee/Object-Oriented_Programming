package week5;

public class Break {

	public static void main(String[] args) {
		// 0~9까지의 랜덤 숫자 중 7이 나오면 프로그램 종료
		
		while (true) 
		{
			int num = (int)(Math.random() * 10);
			
			System.out.println("랜덤 숫자 : " + num);
			
			if (num == 7)
				break;
		}

	}
}
