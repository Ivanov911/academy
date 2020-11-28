package by.academy.homework.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) {
	
	String date = "29-02-2024";
	
//	Pattern pattern = Pattern.compile("^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((1[6-9]|[2-9]\\d)\\d{2}))|"                   //3a dd/MM/yyyy
//			+ "((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((1[6-9]|[2-9]\\d)\\d{2}))|"
//			+ "((0[1-9]|1\\d|2[0-8])\\/02\\/((1[6-9]|[2-9]\\d)\\d{2}))|"
//			+ "(29\\/02\\/((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
	
	
	Pattern pattern = Pattern.compile("^(((0[1-9]|[12]\\d|3[01])\\-(0[13578]|1[02])\\-((1[6-9]|[2-9]\\d)\\d{2}))|"      //3b dd-MM-yyyy 
	        + "((0[1-9]|[12]\\d|30)\\-(0[13456789]|1[012])\\-((1[6-9]|[2-9]\\d)\\d{2}))|"
		    + "((0[1-9]|1\\d|2[0-8])\\-02\\-((1[6-9]|[2-9]\\d)\\d{2}))|"
			+ "(29\\-02\\-((1[6-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$");
	
	Matcher matcher = pattern.matcher(date);
	boolean found = matcher.matches();
	
	if(found)
	    System.out.println("Correct date");
	else
	    System.out.println("Incorrect date");
	
}	
}
