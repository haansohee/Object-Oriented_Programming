package week9;

public class SingletonEx {

	public static void main(String[] args) {
		// 싱글톤으로 정의된 클래스는 new 연산자를 이용하여 객체를 생성할 수 없다.
		// Singleton obj1 = new Singleton();
		// Singleton obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2)
		{
			System.out.println("같은 Singleton 객체를 참조합니다.");
		}
		else 
		{
			System.out.println("다른 Singleton 객체를 참조합니다.");
		}

	}

}
