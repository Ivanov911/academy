package by.academy.homework.homework5.Task6;

import java.util.Arrays;

public class Task6 {
	public static void main(String[] args) {
		int[] intArray = new int[8];

		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}

		try {

			System.out.println("Добавление массива на 10 элементов: " + intArray[10]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("We have an exception here: " + ex + " (\"Array is to small, expand the array\")");
		} finally {
			System.out.println("\n---------------------------");
			System.out.println("Массив: " + Arrays.toString(intArray));

		}
	}
}
