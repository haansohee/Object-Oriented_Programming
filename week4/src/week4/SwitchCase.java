package week4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("�ϼ��� �˰� ���� ���� �Է��ϼ���.");  // ��� ����
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d���� 31���Դϴ�. \n", month);
			break;
			
		case 2:
			System.out.printf("%d���� 28���Դϴ�.\n", month);
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.printf("%d���� 30���Դϴ�\n",month);
			break;
			
		default:
			System.out.println("����� �Է�~");
		}
		
		scanner.close();

	}

}
