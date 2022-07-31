package week4;

import java.util.Scanner;

public class HomeworkBMI {

	public static void main(String[] args) {
		System.out.print("이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.print("키(cm)를 입력하세요: ");		
		int tallcm = sc.nextInt();
		double tall = tallcm / 100.0;
		
		System.out.print("몸무게(kg)를 입력하세요: ");		
		int kg = sc.nextInt();
		
		System.out.printf("%s님의 키는 %dcm이고 몸무게는 %dkg입니다.", name, tallcm, kg);
		
		double bmi = kg / (tall*tall);
		String obj;
		
		if (18.5 <= bmi && bmi <= 22.9) {
			obj = "정상";
			System.out.printf("BMI 지수는 %.2f이고 %s입니다.", bmi, obj);
		}
		else if (23 <= bmi && bmi <= 24.9) {
			obj = "과체중";
			System.out.printf("BMI 지수는 %.2f이고 %s입니다.", bmi, obj);
		}
		else if (25 <= bmi && bmi <= 29.9) {
			obj = "비만";
			System.out.printf("BMI 지수는 %.2f이고 %s입니다.", bmi, obj);
		}
		else if (30 <= bmi) {
			obj = "고도비만";
			System.out.printf("BMI 지수는 %.2f이고 %s입니다.", bmi, obj);
		}
		else
			System.out.println("측정 불가입니다.");
		
		sc.close();
		
		
		
	}

}
