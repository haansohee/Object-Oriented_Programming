package week9;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		// Car ��ü ����
		Car myCar = new Car();
		
		myCar.setGas(5);
		Scanner sc = new Scanner(System.in); // gas �Է��� Scanner �̿�, 0�� �ԷµǸ� ���α׷� ���� (gas �����ϴ� ����)
		int inGas;
		boolean gasStat = myCar.isLeftGas();
		
		
		while (true)
		{
		
			gasStat = myCar.isLeftGas();
			
			if (gasStat)
			{
				System.out.println("����մϴ�.");
				myCar.run();
				continue;
			}
			
			else
			{
				System.out.println("���ᰡ �����ϴ�.");
				System.out.print("gas�� �����ϼ��� >> ");
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
		
		System.out.println("���α׷� ����");
		sc.close();	


	}

}
