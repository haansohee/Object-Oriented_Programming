package week12;
// 익명 구현 객체 실행 클래스
public class VolumeControlEx {

	public static void main(String[] args) {
		Volume vol = new Volume() {
			
			// 반드시 재정의 해야 하는 메소드들 구현 클래스 없이 객체를 바로 만드는 방법
			
			@Override
			public void volumeUp(int level) {
				System.out.println("익명 객체 볼륨을 올립니다. " + level);			
			}
			
			@Override
			public void volumeDown(int level) {
				System.out.println("익명 객체 볼륨을 내립니다. " + level);		
			}
		};
		
		vol.volumeUp(5);
		vol.volumeDown(3);

	}

}
