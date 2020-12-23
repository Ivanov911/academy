package Classwork13;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Xfiles {

	public static void main(String[] args) throws IOException {
		File dir = new File("files");

		if (!dir.exists()) {
			dir.mkdir();
		}
		File src = new File("text1.txt");
		if (!src.exists()) {
			return;
		}
		char[] arr = new char[1024];
		StringBuilder str = new StringBuilder();
		int j = 0;
		try (FileReader fr = new FileReader(src)) {

			while ((j = fr.read(arr)) > 0) {
				str.append(arr);
			}
			System.out.println(str);
			String[] words = str.toString().split(" ");
			System.out.println(words.length);

			int counter = 0;

			for (int i = 0; i < 20; i++) {
				File file = new File(dir, (i + 1) + ".txt");
				if (!file.exists()) {
					file.createNewFile();
				}
				try (FileWriter fw = new FileWriter(file)) {

					fw.write(words[counter++] + " ");
					fw.write(words[counter++] + " ");
					fw.write(words[counter++] + " " + "\n\r");
					LocalDateTime date = LocalDateTime.now();
					fw.write(date.toString());
				}

			}
		}

	}
}