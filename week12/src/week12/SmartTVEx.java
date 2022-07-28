package week12;
// 다중 인터페이스 구현 글래스
public class SmartTVEx {

	public static void main(String[] args) {
		SmartTV smart = new SmartTV();
		
		smart.volumeUp(3);
		smart.volumeDown(2);
		smart.search("네이버");
	}

}
