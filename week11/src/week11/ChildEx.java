package week11;

public class ChildEx {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ : ���α׷� ���� ���߿� �ڵ� Ÿ�� ��ȯ�� �Ͼ�� ��
		
		// Parent Ŭ������ ��ӹ��� Child Ŭ������ �̿��Ͽ� ��ü�� ����
		Child child = new Child();
		
		// �ڽ� Ŭ������ ������ ��ü�� �θ� Ŭ������ ������ ��ü�� ������ �� �ִ�.
		// �̶�, �ڵ� Ÿ�� ��ȯ �ȴ�.
		Parent parent = child;
		
		parent.method1();
		
		//�ڵ� Ÿ�� ��ȯ�� ����� ��� �θ� Ŭ���� ��ü�� �ڽ� Ŭ������ �����ǵ� �޼ҵ尡 ȣ��ȴ�.
		parent.method2();
		
		// �ڽ� ��ü�� �θ� ��ü�� �ڵ� Ÿ�� ��ȯ �Ǹ鼭 �ڽ� ��ü���� ���ǵ� �޼ҵ�� ȣ���� �� ����.
		// parent.method3();  // The method method3() is undefined for the type Parent
		// method3()�� child���� ���ǵǾ� �ִ� �Ŵϱ�...
		
	}

}
