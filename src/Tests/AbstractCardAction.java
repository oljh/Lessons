package Tests;

public abstract class AbstractCardAction {
	private Long account;
	private int id;
	public AbstractCardAction() { // �����������
	}

	public boolean checkLimit() {
		return true;
	}

	public abstract void doPayment(double amountPayment);

}


