package by.academy.homework.homework1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		double summaP;
		int age;
			
		System.out.println("������� ����� �������:");
		summaP = sc.nextDouble();
			System.out.println("������� �������� ����������:");
			age = sc.nextInt();
		sc.close();
					if (summaP < 100) {
						summaP = summaP * 0.95;
						System.out.println("����� ������� � ������ 5% ������ ��������:" + summaP);
						}
			
					 if (100 <= summaP && summaP < 200) {
				summaP = summaP * 0.93;
				System.out.println("����� ������� � ������ 7% ������ ��������:" + summaP);
					}
					 if (200 <= summaP && summaP < 300) {
						if (age >= 18) {
				summaP = summaP * 0.84;
				System.out.println("����� ������� � ������ 16% ������ �� ��������� ��������:" + summaP);
						}
				else { summaP = summaP * 0.88;
						System.out.println("����� ������� � ������ 12% ������ ��������:" + summaP);
				}
			}
					 if (300 <= summaP && summaP < 400) {
					summaP = summaP * 0.85;
					System.out.println("����� ������� � ������ 15% ������ ��������:" + summaP);
				}
					 if (summaP >= 400) {
						summaP = summaP * 0.80;
						System.out.println("����� ������� � ������ 20% ������ ��������:" + summaP);
					}
					
						
					}

	
}
