package week12;
// 디폴트 메소드 재정의
public class Speaker implements Volume{

	private boolean mute;
	private int VolLevel;
	
	public Speaker() {
		VolLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		VolLevel += level;
		System.out.println("스피커 볼륨을 올립니다. " + VolLevel);
	}

	@Override
	public void volumeDown(int level) {
		VolLevel -= level;
		if (VolLevel < 0) {
			VolLevel = 0;
		}
		System.out.println("스피커 볼륨을 내립니다. " + VolLevel);		
	}
	
	@Override
	public void setMute(boolean mute) {  // 디폴트 메소드 재정의
		this.mute = mute;
		
		if (mute) {
			System.out.println("스피커 무음 처리 합니다.");
		}
		else {
			System.out.println("스피커 무음 해제 합니다.");
		}
	}

}
