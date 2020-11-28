package by.academy.homework.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	private Pattern p = Pattern.compile("^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+[a-zA-Z0-9_-]+@[a-zA-Z0-9]+[a-zA-Z0-9.-]+.[a-z]{2,4}$");

	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String... args) {

		System.out.println("�������� �����:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		EmailValidator v = new EmailValidator();

		System.out.println("�� �������� ����������� �����: " + str + " " + v.isValid(str));

	}
}
