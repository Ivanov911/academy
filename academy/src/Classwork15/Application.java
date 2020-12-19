package Classwork15;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Application {
	public static void main(String[] argc) {
		
		Class<Cat> clz = Cat.class;
		
		Field[] fields = clz.getDeclaredFields();
		System.out.println("Declared fields: ");
		for (Field field : fields) {
			
			System.out.println(field.getName());
			
		}
		
		Field[] fieldss = clz.getFields();
		System.out.println("Fields: ");
		for (Field field : fieldss) {
			
			System.out.println(field.getName());
			
		}
		
		Method[] methods = clz.getDeclaredMethods();
		System.out.println("Declared methods: ");
		for (Method method : methods) {
			
			System.out.println(method.getName());
			
		}
		
		Method[] methodss = clz.getMethods();
		System.out.println("Methods: ");
		for (Method method : methodss) {
			
			System.out.println(method.getName());
			
		}
		
		Class<Tiger> clzTiger = Tiger.class;
		
		Field[] fieldsTiger = clzTiger.getDeclaredFields();
		System.out.println("Declared fields: ");
		for (Field field : fieldsTiger) {
			
			System.out.println(field.getName());
			
		}
		
		Field[] fieldssTiger = clzTiger.getFields();
		System.out.println("Fields: ");
		for (Field field : fieldssTiger) {
			
			System.out.println(field.getName());
			
		}
		
		Method[] methodsTiger = clzTiger.getDeclaredMethods();
		System.out.println("Declared methods: ");
		for (Method method : methodsTiger) {
			
			System.out.println(method.getName());
			
		}
		
		Method[] methodssTiger = clzTiger.getMethods();
		System.out.println("Methods: ");
		for (Method method : methodssTiger) {
			
			System.out.println(method.getName());
			
		}
		
		try {
			Tiger tiger = clzTiger.getDeclaredConstructor().newInstance();
			Method mRun = clzTiger.getDeclaredMethod("run");
			mRun.setAccessible(true);
			mRun.invoke(tiger);
			Zoo zoo  = mRun.getAnnotation(Zoo.class);
			
			
			
			System.out.println(zoo.number());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
