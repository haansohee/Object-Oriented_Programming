package week6;

public class Array2 {

	public static void main(String[] args) {
		// 길이가 10인 정수 타입의 배열 선언
		int[] score = new int[10];
		int sum = 0;
		double avg;
		
		System.out.println("랜덤 생성된 점수 배열");
		
		// 각 배열 값에 랜덤하게 생성된 점수(0~99) 대입 곱하기 100
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 100);
			sum += score[i];
			System.out.printf("scores[%d] = %d\n", i, score[i]);
		}

		avg = (double)sum / score.length;
		
		System.out.println("--- 총점 및 평균 ---");	
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %.1f\n", avg);
				
		// 최종 생성된 점수값과 총점 및 평균 출력하기
	}

}
