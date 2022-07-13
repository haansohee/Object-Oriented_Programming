package week2;

public class PrintFormat {

	public static void main(String[] args) {
		int iValue;
		
		iValue = 37;  // �ݵ�� ���� �ʱ�ȭ�ؾ� ��� ����
		System.out.printf("iValue = %d\n", iValue);
		
		// ����Ʈ ���˺� ��� ����
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
