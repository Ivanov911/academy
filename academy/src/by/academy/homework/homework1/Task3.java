package by.academy.homework.homework1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Введите число от 1 до 10: ");
		int s = sc.nextInt();
		sc.close();
		System.out.println("Таблица умножения для числа " + s);
		for (int a = 1; a <= 10; a++) {
			
					System.out.println (s*a);
		
		}	
		}
		}


