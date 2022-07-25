package week11;

public class Car {
	// �ʵ�
	Tire frontLeft = new Tire("�տ���", 6);  // 1�� Ÿ�̾�
	Tire frontRight = new Tire("�տ�����", 2);  // 2�� Ÿ�̾�
	Tire backLeft = new Tire("�ڿ���", 3);  // 3�� Ÿ�̾�
	Tire backRight = new Tire("�ڿ�����", 4);  // 4�� Ÿ�̾�
	
	// ���� �޼ҵ�
	int run()
	{
		System.out.println("�ڵ����� �޸�.");
		
		if (!frontLeft.roll()) 
		{
			stop();  // ��ũ ���� ��� stop() �޼ҵ� ȣ���ϰ�,
			return 1;  // 1�� Ÿ�̾� return
		}
		
		if (!frontRight.roll())
		{
			stop();
			return 2;  // 2�� Ÿ�̾� return
		}
		
		if (!backLeft.roll())
		{
			stop();
			return 3;  // 3�� Ÿ�̾� return
		}
		
		if (!backRight.roll())
		{
			stop();
			return 4;  // 4�� Ÿ�̾� return
		}
		
		return 0;
	}
	
	// ���� �޼ҵ�
	void stop()
	{
		System.out.println("�ڵ����� ����.");
	}

}
