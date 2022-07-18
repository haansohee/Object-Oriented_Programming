package week10;

public class CarBasic {
	
	// 클래스의 각 필드를 private 로 선언해서 외부 접근을 제한함.
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int Fuel;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getFuel() {
		return Fuel;
	}
	public void setFuel(int fuel) {
		Fuel = fuel;
	}
	
	

}
