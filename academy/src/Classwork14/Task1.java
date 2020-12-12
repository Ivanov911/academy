package Classwork14;

import java.util.function.Predicate;

public class Task1 {

	public static void main(String[] args) {

		System.out.println("Задание №1");

		Printable pr = s -> System.out.println(s);
		pr.print("gfgfgfgghgfh");

		Predicate<String> pred = s -> s != null;
		System.out.println(pred.test(null));
		System.out.println(pred.test("hjgjjgh"));
		System.out.println("--------------------");
		System.out.println("Задание №2");

		Predicate<String> predIs = s -> !s.isEmpty();
		System.out.println(predIs.test(""));
		System.out.println(predIs.test("ffgh"));
//		System.out.println(predIs.test(null));

		System.out.println(pred.and(predIs).test("jhmj"));

		System.out.println("--------------------");
		System.out.println("Задание №5");
		// 5. Написать программу, которая проверяет, что строка начинается буквой “J”или
		// “N” и заканчивается “A”. Используем функциональный интерфейс Predicate.
		Predicate<String> chekJ = s -> s.startsWith("J");
		Predicate<String> chekN = s -> s.startsWith("N");
		Predicate<String> chekA = s -> s.endsWith("A");
		System.out.println(chekJ.or(chekN).and(chekA).test("JavA"));
		System.out.println(chekJ.or(chekN).and(chekA).test("java"));
		System.out.println(chekJ.or(chekN).and(chekA).test("javA"));
		
		
		System.out.println("--------------------");
		Predicate<String> chekAll = s -> (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");
		System.out.println(chekAll.test("JavA"));
		System.out.println(chekAll.test("java"));
		System.out.println(chekAll.test("javA"));

	}

}
