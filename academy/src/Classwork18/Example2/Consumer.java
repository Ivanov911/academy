package Classwork18.Example2;

class Consumer implements Runnable {

	private Store store;

	public Consumer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 1; i < 20; i++) {
			store.get();
		}
	}
}