package week13;
//Thead 클래스로부터 직접 생성 
public class BeepTask implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++)
		{
			System.out.println("BEEP~");
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e){	}
		}
		
	}

}
