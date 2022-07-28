package week12;

public class PolyEx {

	public static void main(String[] args) {
		ClassC classC = new ClassC();
		InterfaceA interA = new ClassC();  // ������ ���� ��ü�� ���� �������̽� ������ ����
		InterfaceB interB = new ClassC();  // �̶� �ڵ� Ÿ�� ��ȯ�� �Ͼ
		
		classC.methodA();  // Ŭ���� ClassC�� ������ ��� ����� ȣ���� �� ����
		classC.methodB();  // Ŭ���� ClassC�� ������ ��� ����� ȣ���� �� ����
		
		interA.methodA();  // �������̽� InterfaceA �� ���ǵ� �޼ҵ常 ȣ�� ����
		// interA.methodB();  // �ڵ� ��ȯ �Ŀ��� �ش� �������̽� ����� ȣ���� �� ����
		
		if (interA instanceof ClassC) {  // ��ü Ÿ�� Ȯ�� ��
			ClassC castA = (ClassC)interA;  // ���� Ÿ�� ��ȯ
			castA.methodB();
		}
		
		interB.methodB();  //  �������̽� InterfaceB �� ���ǵ� �޼ҵ常 ȣ�� ����
		// interB.methodA();  // ClassC�� ���ǵǾ� �־ �������̽��� �ڵ� ��ȯ �Ǹ鼭 ȣ�� �Ұ���
		
		if (interB instanceof ClassC) {
			ClassC castB = (ClassC)interB;
			castB.methodA();
		}
	}

}
