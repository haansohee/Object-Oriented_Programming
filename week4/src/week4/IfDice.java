package week4;

public class IfDice {

	public static void main(String[] args) {
		// Math.random() �Լ��� 0~1 ������ �Ǽ��� ��ȯ��.
		double num = Math.random();
		System.out.println("���� ���� = " + num);
		
		// 1~6 ������ ���ڸ� �����ϰ� ��� ���ؼ��� 6�� ���� �� 1�� ����.
		int number = (int)((Math.random() * 6) + 1);
		System.out.printf("�ֻ����� ������ ���� ���� : %d", number);

	}

}
