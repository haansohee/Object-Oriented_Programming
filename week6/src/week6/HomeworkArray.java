package week6;

public class HomeworkArray {

	public static void main(String[] args) {
		int[][] score = new int[5][3];
		
		score[0][0] = 49;  // �л� A�� ���� ����
		score[0][1] = 43;  // �л� A�� ���� ����
		score[0][2] = 49;  // �л� A�� ���� ����
		
		score[1][0] = 80;  // �л� B�� ���� ����
		score[1][1] = 60;  // �л� B�� ���� ����
		score[1][2] = 82;  // �л� B�� ���� ����
		
		score[2][0] = 20;  // �л� C�� ���� ����
		score[2][1] = 85;  // �л� C�� ���� ����
		score[2][2] = 48;  // �л� C�� ���� ����
		
		score[3][0] = 100;  // �л� D�� ���� ����
		score[3][1] = 30;  // �л� D�� ���� ����
		score[3][2] = 50;  // �л� D�� ���� ����
		
		score[4][0] = 80;  // �л� E�� ���� ����
		score[4][1] = 90;  // �л� E�� ���� ����
		score[4][2] = 100;  // �л� E�� ���� ����
		
		char student = 'A';  // �ƽ�Ű�ڵ� 97
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
			System.out.printf("%c �л� ����: %d ��,��� : %.1f ��\n", student,
					sum, avg);
			
			student++;  // ���Ⱑ �ڵ� �������Դϴ�.
		}
		
		
	}

}
