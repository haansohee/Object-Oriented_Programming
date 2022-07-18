package week10;

import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account("123-45-6789", "È«±æµ¿", 100_000);
		System.out.println("°èÁÂ »ý¼º ¿Ï·á.");
		
		System.out.println("<°èÁÂ Á¶È¸>");
		System.out.println(acc.getAccNo() + " " + acc.getOwner() + " " + acc.getBalance());
		
		System.out.print("°èÁÂ ÀÔ±Ý ±Ý¾× >> ");
		int amt = sc.nextInt();
		acc.setBalance(amt);
		
		System.out.println("<°èÁÂ Á¶È¸>");
		System.out.println(acc.getAccNo() + " " + acc.getOwner() + " " + acc.getBalance());
		
		sc.close();
	}

}
