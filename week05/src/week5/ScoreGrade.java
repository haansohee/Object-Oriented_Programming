package week5;

import java.util.Scanner;

public class ScoreGrade {

	public static void main(String[] args) {
		System.out.println("SCORE     GRADE");
		System.out.println("==================");
		
		Scanner sc = new Scanner(System.in);
		// while 음수 입력하면 종료 break
		String grade;
		
		while(true)
		{
			int score = sc.nextInt();
			
			if (score < 0) {
				break;
			}
			
			if (score >= 90) {			
				grade = "A";
			}
			
			else if (score >= 80) {				
				grade = "B";
			}
			
			else if (score >= 70) {
				grade = "C";
			}
			
			else if (score >= 60) {
				grade = "D";
			}
			
			else {
				grade = "F";
			}
			
			System.out.printf("   %d       %s\n", score, grade);
			
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
