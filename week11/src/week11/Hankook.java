package week11;

public class Hankook extends Tire{
	public Hankook(String location, int maxRotation)
	{
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll()
	{
		++accRotation;
		
		if(accRotation < maxRotation) 
		{
			// Ÿ�̾� ������ ���� �ִ� ���
			System.out.println(location + "�ѱ� Ÿ�̾� ���� ���� : " + (maxRotation - accRotation) + "ȸ");
			return true;
		}
		else 
		{
			// Ÿ�̾� ������ �� �ǰ� ��ũ �� ���
			System.out.println("*** " + location + " �ѱ� Ÿ�̾� ��ũ ***");
			return false;
		}
	}

}
