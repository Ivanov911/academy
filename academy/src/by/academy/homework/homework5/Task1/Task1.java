package by.academy.homework.homework5.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {

	public static <T> Set<T> findDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);

	}

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();

		System.out.println("Начальный размер arrayList: " + arrayList.size());

		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		arrayList.add("B");
		arrayList.add("B");
		arrayList.add("A");
		arrayList.add(1, "A2");
		arrayList.add(5, "D");
		arrayList.set(0, "C2");

		System.out.println("Размер arrayList после добавления: " + arrayList.size());
		System.out.println("Содержимое arrayList: " + arrayList);

		Set<String> duplicates = findDuplicates(arrayList);

		System.out.println("Без дубликатов: " + duplicates);
	}

}
