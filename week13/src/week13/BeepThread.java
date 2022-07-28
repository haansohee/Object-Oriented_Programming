package week13;
// Thread 하위 클래스로부터 생성
public class BeepThread extends Thread{
	// Thread 클래스 상속 후 run 메소드 재정의하여 스레드가 실행할 코드 작성 
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep~");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
	}
}
