package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double summaP;
		int age;
			
		System.out.println("Введите сумму покупки:");
		summaP = sc.nextDouble();
			System.out.println("Введите возвраст покупателя:");
			age = sc.nextInt();
		sc.close();
					if (summaP < 100) {
						summaP = summaP * 0.95;
						System.out.println("Сумма покупки с учетом 5% скидки составит:" + summaP);
						}
			
					 if (100 <= summaP && summaP < 200) {
				summaP = summaP * 0.93;
				System.out.println("Сумма покупки с учетом 7% скидки составит:" + summaP);
					}
					 if (200 <= summaP && summaP < 300) {
						if (age >= 18) {
				summaP = summaP * 0.84;
				System.out.println("Сумма покупки с учетом 16% скидки по возврасту составит:" + summaP);
						}
				else { summaP = summaP * 0.88;
						System.out.println("Сумма покупки с учетом 12% скидки составит:" + summaP);
				}
			}
					 if (300 <= summaP && summaP < 400) {
					summaP = summaP * 0.85;
					System.out.println("Сумма покупки с учетом 15% скидки составит:" + summaP);
				}
					 if (summaP >= 400) {
						summaP = summaP * 0.80;
						System.out.println("Сумма покупки с учетом 20% скидки составит:" + summaP);
					}
					
						
					}

	
}
