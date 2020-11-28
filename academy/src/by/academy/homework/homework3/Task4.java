package by.academy.homework.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
	
	    	
	public static void main(String[] args) throws ParseException {
		
	   String date = new String();
  System.out.println("Введите дату");
	   Scanner input = new Scanner(System.in); 
	   date  = input.next().replaceAll("\\D", "");
	   input.close();
	   
	   Date sdf = new SimpleDateFormat("ddMMyyy").parse(date);
	   
	   Calendar cal = Calendar.getInstance();
	   cal.setTime(sdf);
	    
	   System.out.println("День: "+cal.get(Calendar.DAY_OF_MONTH));
	   System.out.println("Месяц: "+(cal.get(Calendar.MONTH)+1));
	   System.out.println("Год: "+cal.get(Calendar.YEAR));
	
	   
}
	}
