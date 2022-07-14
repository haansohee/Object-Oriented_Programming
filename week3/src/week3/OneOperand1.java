package week3;

public class OneOperand1 {

	public static void main(String[] args) {
		int iV1 = +100;
		int iV2 = -100;
		double dV1 = +3.14;
		double dV2 = -10.5;
		
		int result1 = +iV1;
		int result2 = -iV1;
		System.out.printf("result1 = %d\n", result1);
		System.out.printf("result2 = %d\n", result2);
		
		short sV = 100;
		// int보다 크기가 작은 경우 부호 연산자의 결과는 int타입이 됨.
		// short sResult = -sV;  // 에러 발생.
		int sResult = -sV;
		System.out.println("sResult = " + sResult);
		
		byte bV = -100;
		int bResult = -bV;
		System.out.println("bResult = " + bResult);
		
		long lV = 100;
		long lResult = -lV;
		System.out.println("lResult = " + lResult);
		
		double dResult = -dV1;
		System.out.println("dResult = " + dResult);
	}

}
