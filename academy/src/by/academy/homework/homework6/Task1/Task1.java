package by.academy.homework.homework6.Task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		String path = "text.txt";
		try (Scanner read = new Scanner(System.in); BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
			String line = "";
			do {
				System.out.print("Введите информацию из клавиатуры или введите <stop>: ");
				line = read.nextLine();
				if (!line.toLowerCase().equals("stop")) {
					writer.write(line);
					writer.newLine();
					writer.flush();
				}
			} while (!line.toLowerCase().equals("stop"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Введенная информация: ");

		try (FileReader reader = new FileReader("text.txt")) {

			int c;
			while ((c = reader.read()) != -1) {

				System.out.print((char) c);
			}
		} catch (IOException ex) {

			System.out.println(ex.getMessage());
		}
	}
}
