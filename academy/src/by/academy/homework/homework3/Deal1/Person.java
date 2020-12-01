package by.academy.homework.homework3.Deal1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import by.academy.homework.homework3.BelarusianPhoneValidator;
import by.academy.homework.homework3.DateOfBirth;
import by.academy.homework.homework3.EmailValidator;
import by.academy.homework.homework3.Validator;

public class Person {

	public static final Validator BelarusianPhoneValidator = new BelarusianPhoneValidator();
	public static final EmailValidator email = new EmailValidator();

	String name;
	double cash;
	String dateOfBirth;

	public Person(String name, double cash) {
		super();
		this.name = name;
		this.cash = cash;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCash() {
		return cash;
	}

	public void setCash(double cash) {
		this.cash = cash;
	}

	Scanner s = new Scanner(System.in);

	public void dateBir() {
		System.out.println("ВВедите дату ДР в формате ХХ/XX/XXXX или XX-XX-XXXX: ");

		dateOfBirth = s.next();

		DateOfBirth dateB = new DateOfBirth();

		while (!(dateB.prDate1(dateOfBirth) | dateB.prDate2(dateOfBirth))) {
			System.out.println("Неверный формат, введите еще раз: ");
			dateOfBirth = s.next();

		}

		String date = dateOfBirth.replaceAll("\\D", "");
		Date sdf;
		try {
			sdf = new SimpleDateFormat("ddMMyyy").parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf);

			System.out.println("Ваш день рождения: ");
			System.out.println("День: " + cal.get(Calendar.DAY_OF_MONTH));
			System.out.println("Месяц: " + (cal.get(Calendar.MONTH) + 1));
			System.out.println("Год: " + cal.get(Calendar.YEAR));
		} catch (ParseException e) {
			System.out.println("Ошибочка вышла");
			e.printStackTrace();
		}

	}

	public void validat() {

		System.out.println("ВВедите номер телефона в формате ХХХ-ХХХХХХХХХ: ");

		String phone = s.next();
		while (!BelarusianPhoneValidator.isValid(phone)) {
			System.out.println("Телефон введен неверном формфте, введите еще раз: ");
			phone = s.next();
		}
	}

	public void email() {
		System.out.println("ВВедите емейл: ");
		String emai = s.next();
		while (!Person.email.isValid(emai)) {
			System.out.println("ВВеден неверный емайл,введите еще раз: ");
			emai = s.next();
		}

	}
}