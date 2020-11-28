package by.academy.homework.homework3;

import java.util.Scanner;

public class Task11 {
private static int diffWords(String st){ // число уникальных символов (или "убираем повторки")
	    
        StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
        String c; // текущий символ в строке
        for (int i=0;i<st.length();i++) { // обход строки
            c = String.valueOf(st.charAt(i)); // получить текущий символ
            if (u.indexOf(c)==-1) // символ еще не встречался;
                u.append(c); // добавляем
        }
 
        return u.length(); // возвращаем длину получившейся строки без повторок
    }
    
    public static void main(String[] args) {
    		    	
    	Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите количество слов: ");
        int n = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в n
        
        String a[] = new String[n]; // Создаём массив int размером в n
        
    	for (int i = 0; i < n; i++) {
    		System.out.println("Введите " + (i+1) + " словo: ");
        	a[i] = input.next(); // Заполняем массив элементами, введёнными с клавиатуры
           }
        input.close();	    	
        String goal = a[0]; // искомое слово
        System.out.print("Массив: ");
        for (int i=1;i<a.length;i++){
            System.out.print(a[i]+", "); // выводим очередной элемент
            if ( diffWords(a[i])<diffWords(goal))
                    goal = a[i]; // новый мин.эл
        }
        System.out.println("");
        System.out.println("Искомое слово: "+goal+", число разных символов: "+diffWords(goal));
    }
	
	
}
