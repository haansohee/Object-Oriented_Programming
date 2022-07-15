package week5;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		System.out.println("구구단 몇 단을 계산할까?");
		Scanner sc = new Scanner(System.in);
		
		int dan = sc.nextInt();
		
		System.out.printf("구구단 %d단을 계산한다.\n", dan);
		
		for (int i = 1; i < 10; i++)
		{
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
		
		sc.close();

	}

}
