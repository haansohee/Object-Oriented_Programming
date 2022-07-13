package week2;
//Print1의 P가 대문자로 작성되어야 한다. 
/* 파일명과 프로그램 내 클래스명은 반드시 동일해야 한다. */
/*이클립스를 사용하면 클래스 파일 생성 시 입력한 파일명이 자동으로
 * 클래스 명에 적용된다. */

public class Print1 {
	// main 메소드는 반드시 있어야 함.
	// 자바 프로그램을 시작하는 진입점
	// main 메소드는 문자열 매개변수를 가짐.
	/* String의 S는 대문자로 작성되어야 함.*/

	public static void main(String[] args) {
		/* 아래 실행문은 'Hello Java!'를 출력하는 문장 */
		System.out.println("Hello Java!");
		
		// System의 S는 대문자로 작성되어야 함
		System.out.print("Java ");
		
		// 각 실행문의 마지막에는 반드시 세미콜론을 붙여 주어야 함
		System.out.print("World!");
	}

}
