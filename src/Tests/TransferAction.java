package Tests;

public class TransferAction {
	private double transactionAmount;

	public TransferAction(double amount) {
		if (amount > 0) {
			this.transactionAmount = amount;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public boolean transferIntoAccount(Account from, Account to) {
		double demand = from.getAmount() - transactionAmount;
		if (demand >= 0) {
			
			return true;
		} else {
			return false;
		}

	}

}
