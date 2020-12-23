package by.academy.homework.homework6.Task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Task4 {
	public static void main(String[] args) throws IOException {
		File dir = new File("100txt");

		if (!dir.exists()) {
			dir.mkdir();
		}
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

			FileInputStream fis = new FileInputStream(src);
			byte[] byteArray = new byte[(int) src.length()];

			fis.read(byteArray);
			String data = new String(byteArray);
			System.out.println("Число символов в тесте: " + data.length());

			for (int i = 0; i < 100; i++) {
				File file = new File(dir, (i + 1) + ".txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				try (FileWriter writ = new FileWriter(file)) {

					int random = (int) (Math.random() * data.length());
					writ.write(data.substring(0, random) + "");
				}
			}

			File folder = new File("100txt");
			File result = new File("result4.txt");
			if (!result.exists()) {
				result.createNewFile();
				try (FileWriter writ_result = new FileWriter(result)) {
					for (File file : folder.listFiles()) {
						System.out.println("Имя файла: " + file.getName() + "  Размер: " + file.length() + "  байт");
						writ_result.write("Имя файла: " + file.getName() + "  Размер: " + file.length() + "  байт\n");
					}
				}
				fis.close();
				fr.close();
			}
		}
	}
}
