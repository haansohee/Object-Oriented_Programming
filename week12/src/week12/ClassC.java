package week12;

public class ClassC implements InterfaceA, InterfaceB {

	@Override
	public void methodB() {
		System.out.println("methodB");		
	}

	@Override
	public void methodA() {
		System.out.println("methodA");	
	}

}
