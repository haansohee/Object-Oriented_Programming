public class Audio implements RemoteControl{
	
	private int volume;
	private boolean mute;
	
	// turnoOn() 추상 메소드의 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	// turnoOff() 추상 메소드의 실체 메소드
	@Override
	public void turnOff() {
	System.out.println("Audio를 끕니다.");
		
	}

	// setVolume() 추상 메소드의 실체 메소드
	@Override
	public void setVolume(int volume) {
	if (volume > RemoteControl.MAX_VOLUME) {
		this.volume = RemoteControl.MAX_VOLUME;
	}
	else if ( volume < RemoteControl.MIN_VOLUME) {
		this.volume = RemoteControl.MIN_VOLUME;
	}
	else {
		this.volume = volume;
	}
	// 인터페이스 상수를 이용해서 volume 필드의 값을 제한함.
	
	System.out.println("현재 Audio 볼륨 : " +volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Audio 무음 처리 합니다.");
		}
		else {
			System.out.println("Audio 무음 해제 합니다.");
		}
		
	}
	
	

}
