package week13;
// 공유 객체를 사용하는 경우 
public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) throws InterruptedException {
		this.memory = memory;
		
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
