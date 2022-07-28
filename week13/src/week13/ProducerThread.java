package week13;

public class ProducerThread extends Thread {
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox; // 객체가 생성될 때 데이터박스를 매개변수로 갖고 와서 저장 
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data - " + i;
			dataBox.setData(data);
		}
	}
}
// 생산자는 세터를 불러 주고 