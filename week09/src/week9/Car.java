package week9;

public class Car {
	int gas;
	
	public Car()
	{
		System.out.println("Car ������ ����");
	}
	
	void setGas(int gas)  // ���� ����
	{
		this.gas = gas;
	}
	
	boolean isLeftGas()  // ���� ���� �Ǵ�
	{
		boolean result;
		
		if (gas > 0)
		{
			System.out.println("gas�� �ֽ��ϴ�.");
			result =  true;
		}
		else
		{
			System.out.println("gas�� �����ϴ�.");
			result = false;
		}
		
		return result;
	}
	
	void run()  // ���ᰡ �ִ� ���� ��� �޸���. gas�� ������ while�� ���������� break ���
	{
		while(true)
		{
			if (gas > 0)
			{
				System.out.printf("�޸��ϴ�. (gas �ܷ� : %d) \n", gas);
				gas--;
			}
			else
			{
				System.out.printf("����ϴ�. (gas �ܷ� : %d) \n", gas);
				break;
			}
		}
	}
	

}
