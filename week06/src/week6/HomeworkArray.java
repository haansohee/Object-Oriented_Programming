package week6;

public class HomeworkArray {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		
		score[0][0] = 49;  // 학생 A의 국어 점수
		score[0][1] = 43;  // 학생 A의 수학 점수
		score[0][2] = 49;  // 학생 A의 영어 점수
		
		score[1][0] = 80;  // 학생 B의 국어 점수
		score[1][1] = 60;  // 학생 B의 수학 점수
		score[1][2] = 82;  // 학생 B의 영어 점수
		
		score[2][0] = 20;  // 학생 C의 국어 점수
		score[2][1] = 85;  // 학생 C의 수학 점수
		score[2][2] = 48;  // 학생 C의 영어 점수
		
		score[3][0] = 100;  // 학생 D의 국어 점수
		score[3][1] = 30;  // 학생 D의 수학 점수
		score[3][2] = 50;  // 학생 D의 영어 점수
		
		score[4][0] = 80;  // 학생 E의 국어 점수
		score[4][1] = 90;  // 학생 E의 수학 점수
		score[4][2] = 100;  // 학생 E의 영어 점수
		
		char student = 'A';  // 아스키코드 97
		int sum = 0;
		double avg;
		
		for (int i = 0; i < 5; i++)
		{
			sum = 0;
			for (int j = 0; j < 3; j++)
			{
				sum += score[i][j];
			}
			avg = (double)sum / 3.0;
			System.out.printf("%c 학생 총점: %d 점,평균 : %.1f 점\n", student,
					sum, avg);
			
			student++;  // 여기가 코드 마지막입니다.
		}
		
		
	}

}
