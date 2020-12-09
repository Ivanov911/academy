package by.academy.homework.homework4.Task2;

public class Task2Main {

	public static void main(String[] args) {

		Task2<Integer> array1 = new Task2<>(4);

		array1.add(1);
		array1.add(2);
		array1.add(3);
		array1.add(4);
		array1.add(5);
		array1.add(8);
		array1.add(10);
		array1.add(20);
		array1.printArray();
		array1.getFirst();
		array1.getLast();
		array1.getIndex(2);
		array1.getIndexOfLast();
		System.out.println("Вывод размера массива: " + array1.getLength());
		array1.removeIndex(4);
		array1.printArray();
		System.out.println("После удаление элемента по индексу (remove(int i), длина: " + array1.getLength());
		array1.removeValue(8);
		array1.printArray();
		System.out.println("После удаление элемента по индексу (remove(int i) и по значению (remove(T obj)), длина: "
				+ array1.getLength());
		array1.printArray();
		array1.getIndexOfLast();
		System.out.println("----------------------------------------");

		Task2<String> array = new Task2<>();

		array.add("A");
		array.add("B");
		array.add("C");
		array.printArray();
		array.getIndexOfLast();
		array.getFirst();
		array.getLast();
		array.getIndex(1);
		System.out.println("Размер массива: " + array.getLength());
	}

}
