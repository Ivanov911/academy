package Classwork18.Example2;

class Producer implements Runnable {

	private Store store;

	public Producer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		for (int i = 1; i < 20; i++) {
			store.put();
		}
	}
}
