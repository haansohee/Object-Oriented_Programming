package week4;

import java.util.Scanner;

public class ConditionIf {

	public static void main(String[] args) {
		System.out.printf("태어난 연도 입력: ");
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		int age = 2022 - year + 1;
		
		if (8 <= age && age < 14)
			System.out.println("초등학생");
		else if (14 < age && age < 17)
			System.out.println("중학생");
		else if (17 <= age && age < 20)
			System.out.println("고등학생");
		else if (20 <= age && age <=26)
			System.out.println("대학생");
		else
			System.out.println("학생 아님");
		
		scanner.close();
		
		
		

	}

}
