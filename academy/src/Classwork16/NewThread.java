package Classwork16;

public class NewThread extends Thread {

	public void run() {
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int x = 1; x <= 100; x++) {
			System.out.println(x);
	}
	}
}
