package week3;

public class SpeedExam {

	public static void main(String[] args) {
		int m = 100;
		int t = 5;
		
		double v = (double) 100 / (t * 60);
		
		System.out.printf("%d 분 동안 %d m를 이동하는 물체의 속력은 \n", t, m);
		System.out.printf("%.4f m/s입니다.", v);
		
		

	}

}
