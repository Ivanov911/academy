package Classwork15;

import java.lang.reflect.Field;

import com.sun.jdi.Method;



public class Application {

	public static void main(String[] args) {

		Class<Cat> clz = Cat.class;
		Field[] fields = clz.getDeclaredFields();
		System.out.println("Declared fields: ");
		for (Field field : fields) {
			System.out.println(field.getName());
		}

		Class<Tiger> clzTiger = Tiger.class;
		Field[] fieldsTiger = clz.getDeclaredFields();
		System.out.println("Declared fields: ");
		for (Field field : fieldsTiger) {
			System.out.println(field.getName());
		}
		try {
			Tiger tiger = new Tiger();
		Method mRun = clzTiger.getDeclaredMethod("run");
		mRun.setAccessible(true);
		} catch (NoSuchFieldException | SecurityException e) 
	}
}
