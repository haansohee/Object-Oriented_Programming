package week12;

public interface Lendable {
	public byte STATE_BORROWED = 1;  // 대출 중
	public byte STATE_NOMAL = 0;  // 대출 가능
	
	void checkOut(String person, String date);
	void checkIn();
}
