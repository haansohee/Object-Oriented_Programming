package week3;

import java.util.Scanner;

public class ConditionOperator3 {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scanDate = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		score = scanDate.nextInt();
		
		grade = (score>=90)?'A': (score>=80)? 'B': (score>=70)? 'C': (score>=60)? 'D': 'F';
		
		System.out.printf("입력받은 성적 : %d\n", score);
		System.out.printf("등급: %c\n", grade);
				
	}

}
