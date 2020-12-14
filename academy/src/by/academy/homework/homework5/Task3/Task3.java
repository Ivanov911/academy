package by.academy.homework.homework5.Task3;

public class Task3 {
	public static void main(String[] args) {

		Integer[][] array = { { 0, 5, 10, 15 }, { 20, 25, 30, 35 } };

		Array2d<Integer> iterator2d = new Array2d<Integer>(array);

		while (iterator2d.hasNext()) {
			System.out.print(iterator2d.next() + " ");
		}

	}

}
