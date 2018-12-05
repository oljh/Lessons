package by.bsu.market;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Market extends Thread {
	private AtomicLong index;
	public Market(AtomicLong index) {
		this.index = index;
	}
	public AtomicLong getIndex() {
		return index;
	}
	@Override
	public void run() {
		Random random = new Random();
		while(true)
	}
}
