package week10;

public class CarBasicEx {
	public static void main(String[] args) {
		CarBasic car1 = new CarBasic();
		car1.setCompany("현대자동차");
		car1.setModel("그랜저");
		car1.setColor("오션블루");
		car1.setMaxSpeed(350);
		car1.setFuel(50);
		
		System.out.println(car1.getCompany());
		System.out.println(car1.getModel());
		System.out.println(car1.getColor());
		System.out.println(car1.getMaxSpeed());
		System.out.println("-------------------------");
	}

}
