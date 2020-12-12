package by.academy.homework.homework5.Task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		
	 void buildDictionaryWithMap(String text){
		        text = text.toLowerCase();

		        Map<Character, Integer> map = new HashMap<>();
		        for(int i = 0; i < text.length(); i++){
		            char ch = text.charAt(i);

		            
		            if((ch >= 'а' && ch <= 'я') || ch == 'ё'){
		                map.compute(ch, (character, integer)
		                        -> integer == null ? 1 : integer + 1);
		            }
		        }

		        ArrayList<Map.Entry<Character, Integer>> entries =
		                new ArrayList<>(map.entrySet());
		        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
		        for(Map.Entry<Character, Integer> entry : entries){
		            System.out.println(entry.getKey() + " " + entry.getValue());
		        }
		    }
	
}
}
