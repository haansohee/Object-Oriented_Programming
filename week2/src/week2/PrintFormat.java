package week2;

public class PrintFormat {

	public static void main(String[] args) {
		int iValue;
		
		iValue = 37;  // 반드시 변수 초기화해야 사용 가능
		System.out.printf("iValue = %d\n", iValue);
		
		// 프린트 포맷별 출력 유형
		System.out.printf("iValue(5d)  = %5d\n",  iValue);
		System.out.printf("iValue(05d) = %05d\n", iValue);
		System.out.printf("iValue(-5d) = %-5d\n", iValue);
		
		double dValue = 3.141592;
		System.out.printf("dValue = %f\n",     dValue);
		System.out.printf("dValue = %.4f\n",   dValue);
		System.out.printf("dValue = %3.2f\n",  dValue);
		System.out.printf("dValue = %-3.2f\n", dValue);

	}

}
