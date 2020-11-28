package by.academy.homework.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator {
	private Pattern p = Pattern.compile("(\\+*)1\\d{0}-\\d{10}$");
	
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String... args) {

		System.out.println("������� ����� �������� ������� �-����������:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		AmericanPhoneValidator v = new AmericanPhoneValidator();

		System.out.println("���������� �����: " + str + " " + v.isValid(str));

	}

}
