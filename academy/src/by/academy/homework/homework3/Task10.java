package by.academy.homework.homework3;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		
		   String str1 = new String();
		   System.out.println("������� ������ ����� �� ������� ����� ����:");
		   Scanner input = new Scanner(System.in); 
		   str1  = input.next();
		  
		   String str2 = new String();
		   System.out.println("������� ������ ����� �� ������� ����� ����:");
		   Scanner input2 = new Scanner(System.in); 
		   str2  = input2.next();
		   input.close();
		   input2.close();
		 
	        System.out.println("������ ����� = " + str1);
	        System.out.println("������ ����� = " + str2);
	        String str3 = (str1.substring(0, str1.length()/2)) + 
	                (str2.substring(str2.length()/2, str2.length()));
	        System.out.println(str3);
	  
	}
}
