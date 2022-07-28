package week13;
// 생산자도, 소비자도 공
public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if (this.data == null) {  // data 필드가 null 이면 소비자 스레드를 일시 정지 상태로 만듦.
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터 : " + returnValue);
		data = null;  // data 필드를 null 로 만들고 생산자 스레드를 실행 대기 상태로 만듦.
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if (this.data != null) {  // data 필드가 null이 아니면 생산자 스레드를 일시 정지 상태로 만듦.
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		this.data = data;  // data 필드에 값을 저장하고 소비자 스레드를 실행 대기 상태로 만듦.
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}
}
