
public class Computer implements RemoteControl {
	
	private int volume;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Computer를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Computer를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 Computer 볼륨 : " + volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Computer 무음 처리 합니다.");
		}
		else {
			System.out.println("Computer 무음 해제 합니다.");
		}
		
	}

}
