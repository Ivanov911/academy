package by.academy.homework.homework3;

import java.util.Scanner;

public class Task11 {
private static int diffWords(String st){ // ����� ���������� �������� (��� "������� ��������")
	    
        StringBuffer u = new StringBuffer(); // ������, � ������� ������ ������ ����� ����������� ���� �������
        String c; // ������� ������ � ������
        for (int i=0;i<st.length();i++) { // ����� ������
            c = String.valueOf(st.charAt(i)); // �������� ������� ������
            if (u.indexOf(c)==-1) // ������ ��� �� ����������;
                u.append(c); // ���������
        }
 
        return u.length(); // ���������� ����� ������������ ������ ��� ��������
    }
    
    public static void main(String[] args) {
    		    	
    	Scanner input = new Scanner(System.in); // ��������� Scanner
        System.out.println("������� ���������� ����: ");
        int n = input.nextInt(); // ������ � ���������� ������ ������� � ���������� � n
        
        String a[] = new String[n]; // ������ ������ int �������� � n
        
    	for (int i = 0; i < n; i++) {
    		System.out.println("������� " + (i+1) + " ����o: ");
        	a[i] = input.next(); // ��������� ������ ����������, ��������� � ����������
           }
        input.close();	    	
        String goal = a[0]; // ������� �����
        System.out.print("������: ");
        for (int i=1;i<a.length;i++){
            System.out.print(a[i]+", "); // ������� ��������� �������
            if ( diffWords(a[i])<diffWords(goal))
                    goal = a[i]; // ����� ���.��
        }
        System.out.println("");
        System.out.println("������� �����: "+goal+", ����� ������ ��������: "+diffWords(goal));
    }
	
	
}
