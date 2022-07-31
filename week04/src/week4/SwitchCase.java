package week4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("일수를 알고 싶은 달을 입력하세요.");  // 평년 기준
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d월은 31일입니다. \n", month);
			break;
			
		case 2:
			System.out.printf("%d월은 28일입니다.\n", month);
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.printf("%d월은 30일입니다\n",month);
			break;
			
		default:
			System.out.println("제대로 입력~");
		}
		
		scanner.close();

	}

}
