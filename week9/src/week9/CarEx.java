package week9;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		// Car 객체 생성
		Car myCar = new Car();
		
		myCar.setGas(5);
		Scanner sc = new Scanner(System.in); // gas 입력은 Scanner 이용, 0이 입력되면 프로그램 종료 (gas 충전하는 것임)
		int inGas;
		boolean gasStat = myCar.isLeftGas();
		
		
		while (true)
		{
		
			gasStat = myCar.isLeftGas();
			
			if (gasStat)
			{
				System.out.println("출발합니다.");
				myCar.run();
				continue;
			}
			
			else
			{
				System.out.println("연료가 없습니다.");
				System.out.print("gas를 주입하세요 >> ");
				inGas = sc.nextInt();
				
				if (inGas == 0)
				{
					break;
				}
				
				else 
				{
					myCar.setGas(inGas);
				}
			}
		}
		
		System.out.println("프로그램 종료");
		sc.close();	


	}

}
