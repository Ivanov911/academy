package Classwork18.Port;

public class Port {
	private int capacity = 0;
	private int size = 100;

	public synchronized void put() {
		while (capacity >= size) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		capacity++;

		notify();
	}

	public synchronized void get() {
		while (capacity < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		capacity--;
		
		System.out.println(Thread.currentThread().getName() + " взял груз со склада. Сейчас на складе груза: " + capacity);


		notify();
	}
}
