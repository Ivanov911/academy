package by.academy.homework.homework1;

import java.util.Scanner;

public class Task0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float firstNumber, secondNumber, sum;
		
		System.out.println("ВВедите первое число:");
			firstNumber = sc.nextFloat();
			System.out.println("ВВедите второе число:");
			secondNumber = sc.nextFloat();
					sum = firstNumber + secondNumber;
			System.out.println("Сумма двух чисел равна:" + sum);
sc.close();
			
	}

}
