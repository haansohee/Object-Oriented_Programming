package week9;

public class Calculator2Ex {

	public static void main(String[] args) {
		
		int radius = 8;
		double circleArea = Calculator2.pi * radius * radius;
		System.out.printf("반지름이 %d인 원의 면적 = %f \n", radius, circleArea);
		
		int x = 8, y = 7;
		System.out.printf("(%d, %d)의 합 = %d \n", x, y, Calculator2.plus(x, y));
		System.out.printf("(%d, %d)의 차 = %d \n", x, y, Calculator2.minus(x, y));
		
	}
	
}
