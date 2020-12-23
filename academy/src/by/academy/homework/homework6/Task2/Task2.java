package by.academy.homework.homework6.Task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		File src = new File("text1.txt");
		if (!src.exists()) {
			return;
		}

		char[] arr = new char[1024];
		StringBuilder str = new StringBuilder();
		try (FileReader fr = new FileReader(src)) {

			while ((fr.read(arr)) > 0) {
				str.append(arr);
			}
			System.out.println("Программно считатанный файл с текстом:" + "\n" + str);

			String wr = str.toString().replaceAll("\\s", "");
			File file = new File("result.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			try (FileWriter fw = new FileWriter(file)) {
				fw.write(wr.replaceAll("\\s+", ""));
			}

			System.out.println("Записанный текст в файл:" + "\n" + wr.replaceAll("\\s+", ""));
			fr.close();
		}
	}
}
