package by.academy.homework.homework6.Task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Task4 {
	public static void main(String[] args) throws IOException {
		File dir = new File("100txt");

		if (!dir.exists()) {
			dir.mkdir();
		}
		File src = new File("text1.txt");
		if (!src.exists()) {
			return;
		}
		
		char[] arr = new char[1024];
		StringBuilder str = new StringBuilder();
		int j = 0;
		try (FileReader fr = new FileReader(src)) {

			while ((j = fr.read(arr)) > 0) {
				str.append(arr);
			}
			System.out.println("Программно считатанный файл с текстом:" + "\n" + str);
		
	        
	        
	        FileInputStream fis = new FileInputStream(src);
	        byte[] byteArray = new byte[(int)src.length()];
	        
	        fis.read(byteArray);
	        String data = new String(byteArray);
	        System.out.println("Число символов в тесте: "+data.length());
	     
	        
	        
	        
	        
	        
	        
	        int a = 0; // Начальное значение диапазона - "от"
	        int b = data.length(); // Конечное значение диапазона - "до"
	        
//	        int random = a + (int) (Math.random() * b); 
//	        System.out.println("Cлучайное число: " + random);	        
//	        
	        for (int i = 0; i < 100; i++) {
		          int random = a + (int) (Math.random() * b); // создаем рандом
		          String random_partw = data.substring(0, random);
		          
		          
//	        
	        
	        
		          
		          
		          
		          
		          
		          
		          
		          
	        
//	        ileInputStream inFile = new FileInputStream(path_to_file);
//	        byte[] str = new byte[inFile.available()];
//	        inFile.read(str);
//	        String text = new String(str);


//	        for (int i = 0; i < 100; i++) {
//	          int random = a + (int) (Math.random() * b); // создаем рандом
//	          String random_part = text.substring(0, random);
//	         
	                try(FileWriter writer = new FileWriter(dir, (i + 1) + ".txt"))
	                {
	                    writer.write(random_part);                   
	                    writer.flush();
	                }
	                catch(IOException ex){
	                     
	                    System.out.println(ex.getMessage());
	                } 
	            } 
	        
	        
//	   
//	        String [] data1 = new String(byteArray);
//	        
//	        for(int i=0; i < byteArray.length; i++) {
//	            System.out.print(toString.byteArray[i] );
//	        }
		

			
//			System.out.println(wr.length());
//		
//		
//		char[] arr = new char[1024];
//		StringBuilder str = new StringBuilder();
//		int j = 0;
//		try (FileReader fr = new FileReader(src)) {
//
//			while ((j = fr.read(arr)) > 0) {
//				str.append(arr);
//			}
//			System.out.println(str);
//			
//			String wr = str.toString();
//			

			
//			System.out.println(wr.length());
//			String[] s = str.toString().split(" ");
//			System.out.println(s.length);
//			System.out.println(str.toString().length);
//			String[] words = str.toString().split(" ");
//			System.out.println(words.length);
//
//			int counter = 0;
//
//			for (int i = 0; i < 20; i++) {
//				File file = new File(dir, (i + 1) + ".txt");
//				if (!file.exists()) {
//					file.createNewFile();
//				}
//				try (FileWriter fw = new FileWriter(file)) {
//
//					fw.write(words[counter++] + " ");
//					fw.write(words[counter++] + " ");
//					fw.write(words[counter++] + " " + "\n\r");
//					LocalDateTime date = LocalDateTime.now();
//					fw.write(date.toString());
//				}
//
//			}
		}

	}
}
