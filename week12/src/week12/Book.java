package week12;

public class Book implements Lendable{

	String bookNo;  // û�� ��ȣ
	String title;  // ����
	String wrtier;  // ����
	String checkDate;  // ��������
	String person;  // ������
	byte state;  // ���� ����
	
	public Book(String bookNo, String title, String writer) {
		this.bookNo = bookNo;
		this.title = title;
		this.wrtier = writer;
	}
	
	@Override
	public void checkOut(String person, String date) {
		if(state == Lendable.STATE_BORROWED) {
			System.out.println("�̹� ����� �����Դϴ�.");
			return;
		}
		
		this.person = person;
		this.checkDate = date;
		this.state = Lendable.STATE_BORROWED;
		
		System.out.println("* " + title + " ������ ����Ǿ����ϴ�.");
		System.out.println("������ : " + person);
		System.out.println("������ : " + checkDate);
	}

	@Override
	public void checkIn() {
		this.person = null;
		this.checkDate = null;
		this.state = Lendable.STATE_NOMAL;
		System.out.println("-> " + title + " ������ �ݳ��Ǿ����ϴ�.");		
	}

}
