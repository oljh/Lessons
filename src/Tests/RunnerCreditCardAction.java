package Tests;

public class RunnerCreditCardAction {
	public static void main(String[] args) {
		AbstractCardAction action;
		action = new CreditCardAction();
		action.doPayment(100);
	}
}
