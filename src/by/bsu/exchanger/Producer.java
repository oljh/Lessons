package by.bsu.exchanger;

public class Producer extends Subject implements Runnable {
	public Producer(String name, Item item) {
		super(name, item);
	}

	public void run() {
		try {
			synchronized (item) { // ���� ������������� �� ����� �� �����������
				int proposedNumber = this.getItem().getNumber();
				// ����� ������������������� ������������
				item = exchanger.exchange(item);
				if (proposedNumber <= item.getNumber()) {
					System.out.println("Producer " + getName() + "�������� ���� ������������ ������");
				} else {
					System.out.println("Producer " + getName() + "������� ���� ������������ ������");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
