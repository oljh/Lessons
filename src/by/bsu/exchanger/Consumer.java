package by.bsu.exchanger;

public class Consumer extends Subject implements Runnable {
	public Consumer(String name, Item item) {
		super(name,item);
	}
	public void run()
	{
		try {
			synchronized(item) { // ���� ������������� �� �����, �� �����������
				int requiredNumber = item.getNumber();
				item = exchanger.exchange(item); //�����
				if (requiredNumber >= item.getNumber()) {
					System.out.println("Consumer " + getName() + " �������� ��������� ������");
				} else {
					System.out.println("Consumer " + getName() + " ��������� ��������� ������");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
