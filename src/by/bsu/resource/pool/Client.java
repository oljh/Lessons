package by.bsu.resource.pool;

import by.bsu.resource.exception.ResourceException;

public class Client extends Thread {
	private boolean reading = false;
	private ChannelPool<AudioChannel> pool;

	public Client(ChannelPool<AudioChannel> pool) {
		this.pool = pool;
	}

	public void run() {
		AudioChannel channel = null;
		try {
			channel = pool.getResource(100); // �������� �� 100
			reading = true;
			System.out.println("Channel Client #" + this.getId() + " took channel #" + channel.getChannelId());
			channel.using();
		} catch (ResourceException e) {
			System.out.println("Client # " + this.getId() + " lost ->" + e.getMessage());
		} finally {
			if (channel != null) {
				reading = false;
				System.out.println(
						"Channel Client #" + this.getId() + " : " + channel.getChannelId() + "channel released");
				pool.returnResource(channel);
			}
		}
	}
}
