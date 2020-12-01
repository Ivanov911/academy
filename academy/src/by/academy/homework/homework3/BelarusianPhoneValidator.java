package by.academy.homework.homework3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusianPhoneValidator implements Validator {

	private Pattern p = Pattern.compile("(\\+*)375\\d{0}-\\d{9}$");

	@Override
	public boolean isValid(String s) {
		Matcher m = p.matcher(s);
		return m.find();
	}

	public static void main(String... args) {

		System.out.println("ВВедите номер телефона в формате ХХХ-ХХХХХХХХХ :");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		BelarusianPhoneValidator v = new BelarusianPhoneValidator();

		System.out.println("Номер телефона: " + str + " " + v.isValid(str));

	}
}
