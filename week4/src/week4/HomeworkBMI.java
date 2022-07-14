package week4;

import java.util.Scanner;

public class HomeworkBMI {

	public static void main(String[] args) {
		System.out.print("�̸��� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("Ű(cm)�� �Է��ϼ���: ");		
		int tallcm = sc.nextInt();
		double tall = tallcm / 100.0;
		
		System.out.print("������(kg)�� �Է��ϼ���: ");		
		int kg = sc.nextInt();
		
		System.out.printf("%s���� Ű�� %dcm�̰� �����Դ� %dkg�Դϴ�.", name, tallcm, kg);
		
		double bmi = kg / (tall*tall);
		String obj;
		
		if (18.5 <= bmi && bmi <= 22.9) {
			obj = "����";
			System.out.printf("BMI ������ %.2f�̰� %s�Դϴ�.", bmi, obj);
		}
		else if (23 <= bmi && bmi <= 24.9) {
			obj = "��ü��";
			System.out.printf("BMI ������ %.2f�̰� %s�Դϴ�.", bmi, obj);
		}
		else if (25 <= bmi && bmi <= 29.9) {
			obj = "��";
			System.out.printf("BMI ������ %.2f�̰� %s�Դϴ�.", bmi, obj);
		}
		else if (30 <= bmi) {
			obj = "����";
			System.out.printf("BMI ������ %.2f�̰� %s�Դϴ�.", bmi, obj);
		}
		else
			System.out.println("���� �Ұ��Դϴ�.");
		
		sc.close();
		
		
		
	}

}
