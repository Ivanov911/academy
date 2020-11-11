package by.academy.homework.homework2;

import java.util.Scanner;

public class Task2 {
	public static String correctInputString(String in) {

        //������� ����� ���������� � ������ �������
        in = in.replace(".", "");
        in = in.replace(",", "");
        in = in.replace(";", "");
        in = in.replace(":", "");
        in = in.replace("!", "");
        in = in.replace("?", "");
        in = in.replace(".", "");
        in = in.replace("\"", "");
        //������ ��������� ������

        in = in.replace("  ", " "); //������� ������ �������

        in = in.replace(" - ", " ");  //������� ����

        return in;
    }

    public static void findMinLengthAndOutput(String s) {

        String[] words = s.split(" ");

        int minLength = words[0].length(); //����������� ����� �����

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

        System.out.println("�������� ������: " + input);

        input = correctInputString(input);

        System.out.println("������������ ������: " + input);

        System.out.println();
        System.out.println("����� ����������� �����:");
        System.out.println();

        findMinLengthAndOutput(input);
    }
}
