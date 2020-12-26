package Classwork18.Port;

import java.util.Random;

public class Ship implements Runnable {

	private int capacity;
	private boolean isConsumer;
	private Port port;
	private static final int MAX_CAPACITY = 0;

	@Override
	public void run() {
		if (isConsumer) {
			while (capacity <= MAX_CAPACITY) {
			
				Thread.sleep(1000);
				port.get();
				capacity++;
			

		} else {
			while (capacity >= 0) {
				port.put();
				capacity--;
			}
		}
	}

	public Ship(Port port) {
		this.port = port;
		init();
	}

	private void init() {
		Random run = new Random();
		this.isConsumer = run.nextBoolean();
		if (!isConsumer) {
			this.capacity = run.nextInt(MAX_CAPACITY);
		}
		System.out.println ("Прибыл карабль" + (isConsumer ? "Consumer" : "producer"));
	}

}
