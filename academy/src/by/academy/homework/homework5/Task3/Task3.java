package by.academy.homework.homework5.Task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task3 {

	public static void main(String[] args) {
		class Array2d<T> implements Iterable<T> {
			private T[][] array;

			public Array2d(T[][] array) {
				this.array = array;
			}

			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {

					private int i, j;

					@Override
					public boolean hasNext() {
						for (int i = this.i; i < array.length; i++) {
							for (int j = this.j; j < array[i].length; j++) {
								return true;
							}
						}
						return false;
					}

					@Override
					public T next() {
						if (!hasNext())
							throw new NoSuchElementException();
						T t = array[i][j];
						j++;
						for (int i = this.i; i < array.length; i++) {
							for (int j = (i == this.i ? this.j : 0); j < array[i].length; j++) {
								this.i = i;
								this.j = j;
								return t;
							}
						}

						return t;
					}
				};
			}
		}
	}

}
