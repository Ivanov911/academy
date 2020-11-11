package by.academy.homework.homework1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
			
		String type;
		String value;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("¬ведите тип данных: int, double, float, char или String: ");
		    type = sc.nextLine();
		Scanner sc1 = new Scanner(System.in);	    
		System.out.println("¬ведите значение:");
		    value = sc1.nextLine();
		    sc1.close();
		    
		switch (type) {
        case "int": 
        	int int1 = Integer.parseInt(value);
        	System.out.println(int1%2);
        	break;
        case "double": 
        	double double1 = Double.parseDouble(value);
        	System.out.println(double1*0.7);
        	break;
        case "float": 
        	float float1 = Float.parseFloat(value);
        	System.out.println(float1*float1);
        	break;
        case "char": 
        	char char1 = (char)value.charAt(0);
        	System.out.println((int)char1);
        	break;
        case "String": 
        	System.out.println("Hello"+value);
        	break;
        default: System.out.println("Unsupported Type");
        }
	}

}
