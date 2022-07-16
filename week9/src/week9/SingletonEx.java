package week9;

public class SingletonEx {

	public static void main(String[] args) {
		// �̱������� ���ǵ� Ŭ������ new �����ڸ� �̿��Ͽ� ��ü�� ������ �� ����.
		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2)
		{
			System.out.println("���� Singleton ��ü�� �����մϴ�.");
		}
		else 
		{
			System.out.println("�ٸ� Singleton ��ü�� �����մϴ�.");
		}

	}

}
