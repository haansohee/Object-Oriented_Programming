package week13;
// Runnable 을 매개값으로 갖는 생성자 호출
public class BeepTaskEx {

	public static void main(String[] args) throws InterruptedException {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("****");
			Thread.sleep(500);
		}

	}

}
