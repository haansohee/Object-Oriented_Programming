package week9;

public class AreaEx {

	public static void main(String[] args) {
		
		Area area = new Area();
		
		double result1 = area.areaCal(5.1);  // 원
		
		int result2 = area.areaCal(5);  // 정사각형
 
		int result3 = area.areaCal(3, 4);  // 직사각형
		
		System.out.println("원의 넓이 :  " + result1);
		System.out.println("정사각형의 넓이 :  " + result2);
		System.out.println("직사각형의 넓이 :  " + result3);
	}

}
