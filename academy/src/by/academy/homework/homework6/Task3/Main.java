package by.academy.homework.homework6.Task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<User> users = new ArrayList<User>();
		users.add(new User("Виктор", "Шершуков", 10));
		users.add(new User("Анастасия", "Битова", 11));
		users.add(new User("Валентин", "Кириллов", 12));
		users.add(new User("Игорь", "Игнатьев", 13));
		users.add(new User("Наталия", "Самохвалова", 14));
		users.add(new User("Лариса", "Павлова", 15));
		users.add(new User("Андрей", "Баршев", 16));
		users.add(new User("Захар", "Оверченков", 17));
		users.add(new User("Оксана", "Бодалян", 18));
		users.add(new User("Борис", "Волик", 19));
		users.add(new User("Екатерина", "Гусева", 12));

		for (int i = 0; i < users.size(); i++) {
			System.out.println("Имя: " + users.get(i).getName() + "\nФамилия: " + users.get(i).getSurname()
					+ "\nВозвраст: " + users.get(i).getAge() + "\n------------");
		}

		File dir = new File("users");
		if (!dir.exists()) {
			dir.mkdir();
		}

		for (int i = 0; i < users.size(); i++) {
			File file = new File(dir, users.get(i).getName() + "_" + users.get(i).getSurname() + ".txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			try (FileWriter fw = new FileWriter(file)) {
				fw.write("Имя: " + users.get(i).getName() + "\nФамилия: " + users.get(i).getSurname() + "\nВозвраст: "
						+ users.get(i).getAge());
			} catch (Exception e) {

				System.err.println(e.getMessage());
			}

		}
	}
}
