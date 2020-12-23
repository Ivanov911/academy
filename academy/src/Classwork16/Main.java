package Classwork16;

public class Main {
	public static void main(String[] args) {
		NewThread tread1 = new NewThread();
		tread1.setName("First Thread");
		tread1.run();

		System.out.println(tread1.getName());

	}

}
