package by.academy.homework.homework2;

import java.util.Scanner;

public class Task1 {
	
	 static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[256];

        char[] s_array = s.toCharArray();
        
        for (char c : s_array) {
            letters[c]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }
        }

        return true;
    }
	
		
	public static void main(String[] args) {
				
		    Scanner in = new Scanner(System.in);
	        System.out.println("¬ведите первую строку: ");
	        String s1 = in.nextLine();
	        System.out.println("¬ведите вторую строку: ");
	        String s2 = in.nextLine();
	        
	        
	        in.close();
	        	        
	        System.out.println(permutation(s1, s2));
	        
	}
		        
		
	}
	