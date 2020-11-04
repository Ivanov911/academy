package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
			
		String type;
		int Int1;
		double Double1;
		float Float1;
		char Char1;
		String String1;
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("¬ведите тип данных: int, double, float, char или String: ");
		    type = sc.nextLine();
		    sc.close();
	    Scanner sc1 = new Scanner(System.in);	    
		System.out.println("¬ведите значение:");
		if (type=="int")	{
			Int1 = sc1.nextInt();}
	    if (type=="double")	{
			Double1 = sc1.nextDouble();}
	    if (type=="float")	{
			Float1 = sc1.nextFloat();}
	    //if (type=="char")	{
			//Char1 = sc.nextLine();}
	    if (type=="String")	{
			String1 = sc1.nextLine();}
			sc1.close();
			
		switch (type) {
        case "int": System.out.println(Int1%2);break;
        case "double": System.out.println(Double1*0.7);break;
        case "float": System.out.println(Float1);break;
        //case "char": System.out.println((int)Char1);break;
        case "String": System.out.println("Hello"+String1);break;
        default: System.out.println("Unsupported Type");
        }
	}

}
