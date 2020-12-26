package Classwork18.Task1;



public class Runner implements Runnable {
	private static class Resource {
	}

	private final Resource scissors = new Resource();
	private final Resource paper = new Resource();

	public void doSun() {
		synchronized (scissors) { // May deadlock here
			System.out.println(Thread.currentThread().getName() + " взяла ножницы для вырезания солнышка");
			synchronized (paper) {
				System.out.println(Thread.currentThread().getName() + " взяла бумагу для вырезания солнышка");
				System.out.println(Thread.currentThread().getName() + " вырезает солнышко");
			}
		}
	}

	public void doCloud() {
		synchronized (scissors) { // May deadlock here
			System.out.println(Thread.currentThread().getName() + " взяла бумагу для вырезания облачка");
			synchronized (paper) {
				System.out.println(Thread.currentThread().getName() + " взяла ножницы для вырезания облачка");
				System.out.println(Thread.currentThread().getName() + " вырезает облачко");
			}
		}
	}

	public void run() {
		doSun();
		doCloud();
	}

	public static void main(String[] args) {
		Runner job = new Runner();
		Thread masha = new Thread(job, "Маша");
		Thread dasha = new Thread(job, "Даша");
		Thread kasha = new Thread(job, "Каша");
		masha.start();
		dasha.start();
		kasha.start();
	}
}

