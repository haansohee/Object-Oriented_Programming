package week13;
// Thread 클래스로부터 직접 생 -> Runnable 을 매개값으로 갖는 생성자 호출 익명 객체 이용)
public class BeepTaskEx2 {

	public static void main(String[] args) throws InterruptedException{
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				}
			}
		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(500);
		}

	}

}
