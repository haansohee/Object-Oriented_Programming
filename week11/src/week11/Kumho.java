package week11;

public class Kumho extends Tire {
	public Kumho(String location, int maxRotation)
	{
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll()
	{
		++accRotation;
		
		if(accRotation < maxRotation) 
		{
			// 타이어 수명이 남아 있는 경우
			System.out.println(location + "금호 타이어 남은 수명 : " + (maxRotation - accRotation) + "회");
			return true;
		}
		else 
		{
			// 타이어 수명이 다 되고 펑크 난 경수
			System.out.println("*** " + location + " 금호 타이어 펑크 ***");
			return false;
		}
	}

}
