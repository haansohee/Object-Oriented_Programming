package week6;

public class Homework2 {

	public static void main(String[] args) {
		int[][] scores = {{49,43,49},
				{80,60,82},
				{20,85,48},
				{100,30,50},
				{80,90,100}};
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		char stu = 'A';
		
		for(int i = 0; i < scores.length; i++)
		{
			for(int j = 0; j < scores[i].length; j++)
			{
				sum += scores[i][j];
			}
			++cnt;
			avg = (double)sum / cnt;
			stu++;
			
			System.out.printf("%c ÇÐ»ý ÃÑÁ¡ : %d Á¡, Æò±Õ : %.1f Á¡ \n", stu, sum, avg);
			
			cnt = 0;
			avg = 0;
			sum = 0;
		}
	}

}
