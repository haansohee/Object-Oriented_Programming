package week3;

public class CastingType {

	public static void main(String[] args) {
		int iD = 65;
		char cD = (char)iD;
		System.out.printf("cD = %c\n", cD);
		
		long lD = 500;
		iD = (int)lD;
		System.out.printf("iD = %d\n", iD);
		
		double dD = 3.14;
		iD = (int)dD;
		System.out.printf("iD = %d\n", iD);
		
		int iV = 128;
		byte bV = (byte)iV;
		System.out.printf("bV = %d\n", bV);
		
		if (iV >= Byte.MIN_VALUE && iV <= Byte.MAX_VALUE) {
			bV = (byte)iV;
			System.out.printf("bV = %d\n", bV);
		} else {
			System.out.printf("Casting �ϰ��� �ϴ� ������ ���� Ȯ���ϼ���.\n");
			System.out.printf("������ ������ϴ�.");
		}

	}

}
