package week12;

public class SmartTV implements Volume, Searchable{

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");		
	}

	@Override
	public void volumeUp(int level) {
		System.out.println("����Ʈ TV ������ �ø��ϴ�. " + level);		
	}

	@Override
	public void volumeDown(int level) {
		System.out.println("����Ʈ TV ������ �����ϴ�. " +level);
	}

}
