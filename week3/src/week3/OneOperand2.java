package week3;

public class OneOperand2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		// ++�����ڴ� �ǿ������� ���� ���� 1�� ���ؼ� �� ����� �ٽ� �ǿ����ڿ� ������.
		// ++ ��ȣ�� �ǿ������� �ڿ� ������ ������ ������ �ڿ� 1�� ����.
		
		System.out.println("x++ = " + x++);
		System.out.println("-----------------");
		
		// ++ ��ȣ�� �ǿ������� �տ� ������ ������ �����ϱ� ���� 1�� ���� ����.
		
		System.out.println("++x = " + ++x);
		System.out.println("-----------------");
		
		z = x++;
		System.out.println("z = " + z + ", x = " + x);
		System.out.println("-----------------");
		
		// -- �����ڴ� �ǿ������� ���� ���� 1�� ���� �� ����� �ٽ� �ǿ����ڿ� ������.
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}

}
