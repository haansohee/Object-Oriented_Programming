package week3;

import java.util.Scanner;

public class HomeworkCondition {

	public static void main(String[] args) {
		int score;
		char grade;
		
		Scanner scanData = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		score = scanData.nextInt();
		
		grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : ((score > 70) ? 'C': ((score > 60) ? 'D' : 'F')));
		
		System.out.println("�Է¹��� ���� : " + score);
		System.out.println("���: " + grade);
		
		scanData.close();

	}

}
