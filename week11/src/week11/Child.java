package week11;

public class Child extends Parent {
	// Parent 클래스에 정의된 method2()를 재정의한다.
	@Override
	public void method2()
	{
		System.out.println("Child-method2");
	}
	
	// method3()는 Child 클래스에만 정의된 메소드
	public void method3()
	{
		System.out.println("Child-medthod3");
	}
}

