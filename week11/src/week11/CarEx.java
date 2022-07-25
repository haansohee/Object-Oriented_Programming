package week11;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i  = 0; i < 11; i++)
		{
			int flat = car.run();
			
			if (flat == 1)
			{
				System.out.println("한국 타이어로 교체");
				car.frontLeft = new Hankook("앞왼쪽", 15);  // 부모 객체 (Tire) = 자식 객체 (Hankook) , 부모 안에 자식을 넣으면서 자동 타입 변환 적용
			}
			
			else if (flat == 2)
			{
				System.out.println("한국 타이어로 교체");
				car.frontRight = new Hankook("앞오른쪽", 15);
			}
			
			else if (flat == 3)
			{
				System.out.println("금호 타이어로 교체");
				car.backLeft = new Kumho("뒤왼쪽", 20);
			}
			
			else if (flat == 4)
			{
				System.out.println("금호 타이어로 교체");
				car.backRight = new Kumho("뒤오른쪽", 20);
			}
			
			System.out.println("-------------");
		}

	}

}
