package week10;

import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account("123-45-6789", "ȫ�浿", 100_000);
		System.out.println("���� ���� �Ϸ�.");
		
		System.out.println("<���� ��ȸ>");
		System.out.println(acc.getAccNo() + " " + acc.getOwner() + " " + acc.getBalance());
		
		System.out.print("���� �Ա� �ݾ� >> ");
		int amt = sc.nextInt();
		acc.setBalance(amt);
		
		System.out.println("<���� ��ȸ>");
		System.out.println(acc.getAccNo() + " " + acc.getOwner() + " " + acc.getBalance());
		
		sc.close();
	}

}
