package by.academy.homework.homework5.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task4 {
	public static void main(String[] args) {
		int element = 15; // Всего ученико
		System.out.println("Всего учеников: " + element);

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < element; i++) {
			int a = (int) (Math.random() * 10 + 0.5);
			Integer b = (int) (a);
			list.add(i, b);
		}

		Iterator<Integer> it = list.iterator();
		Integer max1 = 0;
		while (it.hasNext()) {
			if (max1 == 0) {
				max1 = it.next();
			} else {
				Integer e = it.next();
				if (e.compareTo(max1) > 0) {
					max1 = e;

				}

			}

		}

		System.out.println("Весь список оценок: " + list);
		System.out.println("Максимальная оценка: " + (Collections.max(list)));
		System.out.println("Максимальная оценка (c Iterator): " + max1);

	}
}