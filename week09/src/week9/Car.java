package week9;

public class Car {
	int gas;
	
	public Car()
	{
		System.out.println("Car 생성자 실행");
	}
	
	void setGas(int gas)  // 연료 충전
	{
		this.gas = gas;
	}
	
	boolean isLeftGas()  // 연료 유무 판단
	{
		boolean result;
		
		if (gas > 0)
		{
			System.out.println("gas가 있습니다.");
			result =  true;
		}
		else
		{
			System.out.println("gas가 없습니다.");
			result = false;
		}
		
		return result;
	}
	
	void run()  // 연료가 있는 동안 계속 달린다. gas가 없으면 while문 빠져나오는 break 사용
	{
		while(true)
		{
			if (gas > 0)
			{
				System.out.printf("달립니다. (gas 잔량 : %d) \n", gas);
				gas--;
			}
			else
			{
				System.out.printf("멈춥니다. (gas 잔량 : %d) \n", gas);
				break;
			}
		}
	}
	

}
