package week11;

public class ChildEx {

	public static void main(String[] args) {
		// 자동 타입 변환 : 프로그램 실행 도중에 자동 타입 변환이 일어나는 것
		
		// Parent 클래스를 상속받은 Child 클래스를 이용하여 객체를 생성
		Child child = new Child();
		
		// 자식 클래스로 생성된 객체는 부모 클래스로 생성된 객체에 대입할 수 있다.
		// 이때, 자동 타입 변환 된다.
		Parent parent = child;
		
		parent.method1();
		
		//자동 타입 변환이 적용된 경우 부모 클래스 객체라도 자식 클래스의 재정의된 메소드가 호출된다.
		parent.method2();
		
		// 자식 객체가 부모 객체로 자동 타입 변환 되면서 자식 객체에만 정의된 메소드는 호출할 수 없다.
		// parent.method3();  // The method method3() is undefined for the type Parent
		// method3()는 child에만 정의되어 있는 거니까...
		
	}

}
