package week9;
// 하나의 애플리케이션 내에서 단 하나의 객체 생성만 허용할 경우 -> 싱글톤 사용
// 싱글톤 만드는 방법 예제 코드
public class Singleton {
	// 1. 자신의 객체를 생성해서 초기화한다.
	// 2. private 접근 제한자를 붙여 외부에서 필드값 변경이 불가능하도록 한다.
	private static Singleton singleton = new Singleton();
	
	// 3. 외부에서 new 연산자로 생성자 호출이 불가능하도록 private 접근 제한자를 붙인다.
	private Singleton()
	{
		
	}
	
	// 4. 외부에서 객체 생성 없이도 호출할 수 있도록 정적 메소드를 선언한다.
	static Singleton getInstance()
	{
		// 5. 정적 필드에서 참조하고 있는 자신의 객체를 return
		return singleton;
	}
	
	// 6. getInstance() 를 이용하여 생성자 객체는 모두 같은 객체를 참조하게 된다.
	

}
