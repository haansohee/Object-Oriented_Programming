package week9;
// �ϳ��� ���ø����̼� ������ �� �ϳ��� ��ü ������ ����� ��� -> �̱��� ���
// �̱��� ����� ��� ���� �ڵ�
public class Singleton {
	// 1. �ڽ��� ��ü�� �����ؼ� �ʱ�ȭ�Ѵ�.
	// 2. private ���� �����ڸ� �ٿ� �ܺο��� �ʵ尪 ������ �Ұ����ϵ��� �Ѵ�.
	private static Singleton singleton = new Singleton();
	
	// 3. �ܺο��� new �����ڷ� ������ ȣ���� �Ұ����ϵ��� private ���� �����ڸ� ���δ�.
	private Singleton()
	{
		
	}
	
	// 4. �ܺο��� ��ü ���� ���̵� ȣ���� �� �ֵ��� ���� �޼ҵ带 �����Ѵ�.
	static Singleton getInstance()
	{
		// 5. ���� �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� return
		return singleton;
	}
	
	// 6. getInstance() �� �̿��Ͽ� ������ ��ü�� ��� ���� ��ü�� �����ϰ� �ȴ�.
	

}
