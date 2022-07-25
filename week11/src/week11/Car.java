package week11;

public class Car {
	// 필드
	Tire frontLeft = new Tire("앞왼쪽", 6);  // 1번 타이어
	Tire frontRight = new Tire("앞오른쪽", 2);  // 2번 타이어
	Tire backLeft = new Tire("뒤왼쪽", 3);  // 3번 타이어
	Tire backRight = new Tire("뒤오른쪽", 4);  // 4번 타이어
	
	// 주행 메소드
	int run()
	{
		System.out.println("자동차가 달림.");
		
		if (!frontLeft.roll()) 
		{
			stop();  // 펑크 났을 경우 stop() 메소드 호출하고,
			return 1;  // 1번 타이어 return
		}
		
		if (!frontRight.roll())
		{
			stop();
			return 2;  // 2번 타이어 return
		}
		
		if (!backLeft.roll())
		{
			stop();
			return 3;  // 3번 타이어 return
		}
		
		if (!backRight.roll())
		{
			stop();
			return 4;  // 4번 타이어 return
		}
		
		return 0;
	}
	
	// 정지 메소드
	void stop()
	{
		System.out.println("자동차가 정지.");
	}

}
