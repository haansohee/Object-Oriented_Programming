package week10;

public class Parent {

	private String nation;
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(string nation) call");
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
	
	
}
