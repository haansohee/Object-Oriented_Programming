package week9;

public class Calculator2Ex {

	public static void main(String[] args) {
		
		int radius = 8;
		double circleArea = Calculator2.pi * radius * radius;
		System.out.printf("�������� %d�� ���� ���� = %f \n", radius, circleArea);
		
		int x = 8, y = 7;
		System.out.printf("(%d, %d)�� �� = %d \n", x, y, Calculator2.plus(x, y));
		System.out.printf("(%d, %d)�� �� = %d \n", x, y, Calculator2.minus(x, y));
		
	}
	
}
