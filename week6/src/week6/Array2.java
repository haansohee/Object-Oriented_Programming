package week6;

public class Array2 {

	public static void main(String[] args) {
		// ���̰� 10�� ���� Ÿ���� �迭 ����
		int[] score = new int[10];
		int sum = 0;
		double avg;
		
		System.out.println("���� ������ ���� �迭");
		
		// �� �迭 ���� �����ϰ� ������ ����(0~99) ���� ���ϱ� 100
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 100);
			sum += score[i];
			System.out.printf("scores[%d] = %d\n", i, score[i]);
		}

		avg = (double)sum / score.length;
		
		System.out.println("--- ���� �� ��� ---");	
		System.out.printf("���� : %d \n", sum);
		System.out.printf("��� : %.1f\n", avg);
				
		// ���� ������ �������� ���� �� ��� ����ϱ�
	}

}
