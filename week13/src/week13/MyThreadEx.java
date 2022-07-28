package week13;

public class MyThreadEx {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			MyThread thread = new MyThread(i + 1);
			thread.start();
			
			//스레드 상태 제어 예제
			/*  try {
				thread.join();  // join() : 해당 스레드가 종료되기 전까지 다른 스레드를 실행하지 않는 기능 
			} catch (InterruptedException e) {} */
		}
	}

}
