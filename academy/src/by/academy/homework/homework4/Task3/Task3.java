package by.academy.homework.homework4.Task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task3 {

	private static <T> Iterator<T> getIterator(final T[] array) {
		return new Iterator<T>() {
			private int count = array.length;
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < count;
			}

			@Override
			public T next() {
				if (index < count) {
					return array[index++];
				} else {
					throw new NoSuchElementException("No such element.");
				}
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Cannot remove item from array.");
			}
		};
	}

	public static void main(String[] args) {
		Integer[] integers = new Integer[] { 20, 210, 124, 20, 213, 42, 65, 544 };
		Double[] doubles = new Double[] { 0.12, 0.2, 0.3, 0.5 };

		Iterator<Integer> integerIterator = getIterator(integers);

		while (integerIterator.hasNext()) {
			System.out.println(integerIterator.next());
		}

		Iterator<Double> doubleIterator = getIterator(doubles);
		while (doubleIterator.hasNext()) {
			System.out.println(doubleIterator.next());
		}

	}
}
