package week4;

import java.util.Scanner;

public class ConditionIf {

	public static void main(String[] args) {
		System.out.printf("�¾ ���� �Է�: ");
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		int age = 2022 - year + 1;
		
		if (8 <= age && age < 14)
			System.out.println("�ʵ��л�");
		else if (14 < age && age < 17)
			System.out.println("���л�");
		else if (17 <= age && age < 20)
			System.out.println("����л�");
		else if (20 <= age && age <=26)
			System.out.println("���л�");
		else
			System.out.println("�л� �ƴ�");
		
		scanner.close();
		
		
		

	}

}
