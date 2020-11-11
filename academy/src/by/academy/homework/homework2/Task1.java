package by.academy.homework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("¬ведите первую строку: ");
        String s1 = in.nextLine();
        System.out.print("¬ведите вторую строку: ");
        String s2 = in.nextLine();
        System.out.println(st(s1,s2));
        in.close();
	}
//	public static boolean st(String s1, String s2) {
//	       if (s1.length() != s2.length()) {
//	    	 return false; 
//	       }
//	           char[] x = s1.toCharArray();
//	           char[] y = s2.toCharArray();
//	           Arrays.sort(x);
//	        	    Arrays.sort(y);
//	        	    if(Arrays.equals(x, y))
//	        	    	 return true;
//	        	    return false;
//	        	
	        	 
	public static boolean st(String s1, String s2) {
	      	       if (s1.length() != s2.length()) {
	      	    	 return false;
	      	       }
	      	       int[] letters = new int[256];

	      	       char[] s1_array = s1.toCharArray();
	      	       for (char c : s1_array) {
	      	           letters[c]++;
	      	       }
	      	       for (int i = 0; i < s2.length(); i++) {
	      	           int c = (int) s2.charAt(i);
	      	           if (--letters[c] < 0) {
	      	        	 return false;
	      	       }
	      	       }
	      	     return true;	      	     
	}      
	}

