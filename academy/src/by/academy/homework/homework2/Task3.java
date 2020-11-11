package by.academy.homework.homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Task3 {

	public class LessDiffLetters {
	    static int diffLetters(String wrd) {
	        Set<Character> chars = new HashSet<Character>();
	        for ( char c : wrd.toCharArray() )
	            chars.add(c);
	        return chars.size();
	    }
	    
	    public static void main(String[] args) {
	        String[] strings = { "any many money more", "jingle bells jingle bells jingle all the way" };
	        List<String> words = new ArrayList<String>();
	        
	        for ( String s: strings )
	            words.addAll(Arrays.asList(s.split("\\s+")));
	        
	        Collections.sort(words, new Comparator<String>() {
	            public int compare(String a, String b) {
	                return diffLetters(a) - diffLetters(b);
	            }
	        });
	        
	        for ( String w: words )
	            System.out.println(w);
	    }
	}