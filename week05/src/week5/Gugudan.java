package week5;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("������ �� ���� ����ұ�?");
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		System.out.printf("������ %d���� ����Ѵ�.\n", dan);
		
		for (int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
		
		sc.close();

	}

}
