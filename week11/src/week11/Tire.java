package week11;

public class Tire {
	public String location; // Ÿ�̾� ��ġ
	public int maxRotation; // �ִ� ȸ�� �� (Ÿ�̾� ����)
	public int accRotation; // ���� ȸ�� ��
	
	// ������
	
	public Tire(String location, int maxRotation)
	{
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll()
	{
		++accRotation;  // �� ���� �� ������ ���� ȸ�� �� ����
		
		if (accRotation < maxRotation)
		{
			// Ÿ�̾� ������ ���� �ִ� ���
			System.out.println(location + "���� ���� : " +(maxRotation-accRotation)
								+ "ȸ");
			return true;
		}
		
		else
		{
			// Ÿ�̾� ������ �� �ǰ� ��ũ �� ���
			System.out.println("*** " + location + "Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
