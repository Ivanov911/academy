package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {
	public static String correctInputString(String in) {

        //удаляем знаки препинания и лишние пробелы
        in = in.replace(".", "");
        in = in.replace(",", "");
        in = in.replace(";", "");
        in = in.replace(":", "");
        in = in.replace("!", "");
        in = in.replace("?", "");
        in = in.replace(".", "");
        in = in.replace("\"", "");
        //можете дополнить список

        in = in.replace("  ", " "); //удаляем лишние пробелы

        in = in.replace(" - ", " ");  //удаляем тире

        return in;
    }

    public static void findMinLengthAndOutput(String s) {

        String[] words = s.split(" ");

        int minLength = words[0].length(); //минимальная длина слова

        for(String word : words) {
            if(word.length() < minLength) {
                minLength = word.length();
            }
        }

        for(String word : words) {
            if(word.length() == minLength) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        System.out.println("Исходная строка: " + input);

        input = correctInputString(input);

        System.out.println("Обработанная строка: " + input);

        System.out.println();
        System.out.println("Слова минимальной длины:");
        System.out.println();

        findMinLengthAndOutput(input);
    }
}
