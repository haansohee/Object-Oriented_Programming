
public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl[] rc = new RemoteControl[3];  // 인터페이스 변수 선언
		rc[0] = new Television();
		rc[1] = new Audio();
		rc[2] = new Computer();
		
		for (int i = 0; i < rc.length; i++)
		{
			rc[i].turnOn();
			rc[i].turnOff();
			rc[i].setMute(false);
			rc[i].setVolume(25);
			
			System.out.println();
		}
		
		/* rc = new Television();  // Television 객체를 인터페이스 변수로 선언
		rc.turnOn();  // 인터페이스의 turnOn(), turnOff() 메소드
		rc.turnOff();
		rc.setMute(false);
		rc.setVolume(25);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		rc.setVolume(25);
		
		rc = new Computer();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		rc.setVolume(25); */ 
		
		
		

	}

}
