package by.academy.homework.homework7.Task1;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
	public static void main(String[] args) {
		System.out.println();

		List<Long> firstpart = new Random().longs(100, 1, 100).map(x -> (x * ((long) Math.PI) - 20))
				.filter(x -> x < 100).sorted().skip(3).distinct().boxed().collect(Collectors.toList());

		Map<Long, String> secondpart = firstpart.stream().collect(Collectors.toMap(x -> x, y -> "Number: " + y));
		System.out.println("Результат: \n " + secondpart);

	}

}
