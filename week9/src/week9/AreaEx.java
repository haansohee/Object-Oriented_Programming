package week9;

public class AreaEx {

	public static void main(String[] args) {
		
		Area area = new Area();
		
		double result1 = area.areaCal(5.1);  // ��
		
		int result2 = area.areaCal(5);  // ���簢��
 
		int result3 = area.areaCal(3, 4);  // ���簢��
		
		System.out.println("���� ���� :  " + result1);
		System.out.println("���簢���� ���� :  " + result2);
		System.out.println("���簢���� ���� :  " + result3);
	}

}
