package Classwork18.Port;

public class PortAplication {

	public static void main(String[] args) {
		Port port = new Port();
while (true) {
	Thread t = new Thread (new Ship(port));
	t.start();
}
	}

}
