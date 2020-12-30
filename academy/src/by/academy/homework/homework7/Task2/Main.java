package by.academy.homework.homework7.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		Class<User> clzUser = User.class;

		User user = new User("Жорик", "12345", "zxcvb@mail.ru");

		try {
			Method metod = clzUser.getMethod("printUserInfo");
			System.out.println("Method name is: " + metod.getName());
		} catch (NoSuchMethodException | SecurityException e1) {
			System.out.println("There is no public methods! ");
		}

		Method[] method = clzUser.getMethods();
		System.out.println("User methods: ");
		for (Method m : method) {
			System.out.println(m.getName());
		}

		try {
			Field fielld = clzUser.getField("login");
			String loginValue = (String) fielld.get(user);
			System.out.println("User login is: " + loginValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Field[] fieldd = clzUser.getFields();
		System.out.println("User fields: ");
		for (Field f : fieldd) {
			System.out.println(f.getName());
		}

		System.out.println("\nDeclared:\n");

		try {
			Method declaredMethod = clzUser.getDeclaredMethod("printUserInfo");
			System.out.println("DeclaredMethod name is: " + declaredMethod.getName());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

		Method[] declaredMethods = clzUser.getDeclaredMethods();
		System.out.println("Declared User methods: ");
		for (Method m : declaredMethods) {
			System.out.println(m.getName());
		}

		try {
			Field declaredField = clzUser.getDeclaredField("password");
			declaredField.setAccessible(true);

			String passwordValue = (String) declaredField.get(user);
			System.out.println("User declared password is: " + passwordValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Field[] field = clzUser.getDeclaredFields();
		System.out.println("Declared User fields: ");
		for (Field f : field) {
			System.out.println(f.getName());
		}

		System.out.println("\nSet-Get:\n");

		try {
			Field setValueField = clzUser.getDeclaredField("password");
			setValueField.setAccessible(true);
			setValueField.set(user, "12345");
			String passwordValue = (String) setValueField.get(user);
			System.out.println("User changed password is: " + passwordValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field setValueField = clzUser.getDeclaredField("login");
			setValueField.setAccessible(true);
			setValueField.set(user, "Жорик");
			String loginValue = (String) setValueField.get(user);
			System.out.println("User changed login is: " + loginValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field setValueField = clzUser.getDeclaredField("email");
			setValueField.setAccessible(true);
			setValueField.set(user, "zxcvb@mail.ru");
			String emailValue = (String) setValueField.get(user);
			System.out.println("User changed email is: " + emailValue);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("\nInvoke:\n");

		try {
			Method declaredMethod = clzUser.getDeclaredMethod("printUserInfo");
			declaredMethod.setAccessible(true);
			declaredMethod.invoke(user);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}