package week12;
// �͸� ���� ��ü ���� Ŭ����
public class VolumeControlEx {

	public static void main(String[] args) {
		Volume vol = new Volume() {
			
			// �ݵ�� ������ �ؾ� �ϴ� �޼ҵ�� ���� Ŭ���� ���� ��ü�� �ٷ� ����� ���
			
			@Override
			public void volumeUp(int level) {
				System.out.println("�͸� ��ü ������ �ø��ϴ�. " + level);			
			}
			
			@Override
			public void volumeDown(int level) {
				System.out.println("�͸� ��ü ������ �����ϴ�. " + level);		
			}
		};
		
		vol.volumeUp(5);
		vol.volumeDown(3);

	}

}
