package by.academy.homework.homework4.Task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

	String date;

	public Date() {
		super();
	}

	public Date(String date) {
		super();
		this.date = date;
	}

	public enum DayofWeek {
		ПОНЕДЕЛЬНИК, ВТОРНИК, СРЕДА, ЧЕТВЕРГ, ПЯТНИЦА, СУББОТА, ВОСКРЕСЕНЬЕ
	}

	public boolean isValid(String firstdate) {
		Pattern pattern = Pattern.compile("^(((0[1-9]|[12]\\d|3[01])\\-(0[13578]|1[02])\\-((1[1-9]|[2-9]\\d)\\d{2}))|"
				+ "((0[1-9]|[12]\\d|30)\\-(0[13456789]|1[012])\\-((1[1-9]|[2-9]\\d)\\d{2}))|"
				+ "((0[1-9]|1\\d|2[0-8])\\-02\\-((1[1-9]|[2-9]\\d)\\d{2}))|"
				+ "(29\\-02\\-((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
		Matcher matcher = pattern.matcher(firstdate);
		return (matcher.find());

	}

	public void getDayOfWeek(String input) throws ParseException {

		Pattern pattern = Pattern.compile("(\\d{2}[\\-]){2}\\d{4}");

		Matcher matcher = pattern.matcher(input);
		if (matcher.find()) {
			String oldDateString = matcher.group();
			SimpleDateFormat DateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
			SimpleDateFormat DateFormat2 = new SimpleDateFormat("EEEE");

			java.util.Date date = DateFormat1.parse(oldDateString);

			String result = DateFormat2.format(date).toUpperCase();

			DayofWeek dayofweek = DayofWeek.valueOf(result);

			System.out.println("День недели:  " + dayofweek);
		} else {
			System.out.println("Неверный формат! ");
		}
	}

	public class Year {
		private String year;

		public Year() {
			super();
		}

		public Year(String year) {
			super();
			this.year = year;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public boolean isLeapYear(String year) {
			int leapYear = Integer.parseInt(year);
			if (leapYear % 4 == 0) {
				return true;
			}
			if (leapYear % 100 == 0) {
				return false;
			}
			if (leapYear % 400 == 0) {
				return true;
			}
			return false;
		}
	}

	public class Month {
		String month;

		public Month() {
			super();
		}

		public Month(String month) {
			super();
			this.month = month;
		}

		public String getMonth() {
			return month;
		}

		public void setMonth(String month) {
			this.month = month;
		}
	}

	public class Day {
		String day;

		public Day() {
			super();
		}

		public Day(String day) {
			super();
			this.day = day;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

	}

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		Date.Year year = date.new Year();
		year.setYear("2020");

		Date.Month month = date.new Month();
		month.setMonth("12");

		Date.Day day = date.new Day();
		day.setDay("02");

		String dateOne = day.getDay() + "-" + month.getMonth() + "-" + year.getYear();
		date.isValid(dateOne);

		System.out.println("Базовая дата: " + dateOne);
		System.out.println("Год високосный? " + year.isLeapYear(year.getYear()));

		date.getDayOfWeek(dateOne);

		System.out.println("Введите вторую дату в формате dd-mm-yyyy :");
		Scanner sc = new Scanner(System.in);
		String dateTwo = sc.next();

		while (!date.isValid(dateTwo)) {
			System.out.println("Неверный формат даты, введите еще раз: ");
			dateTwo = sc.next();
		}
		sc.close();

		try {
			java.util.Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dateOne);

			java.util.Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(dateTwo);

			long difference = date1.getTime() - date2.getTime(); // Количество дней между датами в миллисекундах

			int days = (int) (difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)

			System.out.println(days + " дней в промежутке между " + dateOne + " и " + dateTwo);

		} catch (Exception e) {
			System.out.println("Ранее введенная дата имеет невалидный формат для вычисления");
		}

	}
}
