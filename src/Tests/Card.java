package Tests;

public class Card {
	//������������������ ��������� ����������
	public final int ID = (int)(Math.random()*10_000_000);
	//�������������������� ���������
	public final long BANK_ID;
	
	public Card (long id) {
		BANK_ID =id;
	}
	
	public final boolean checkRights(final int number) {
		final int CODE = 72172294;
		return CODE == number+ID;
		
	}
}
