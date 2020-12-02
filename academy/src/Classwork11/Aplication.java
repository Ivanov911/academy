package Classwork11;

public class Aplication {

	public static void main(String[] args) {
		LinkedListCustom<Integer> list = new LinkedListCustom<>();
		list.add(1);		
		list.add(2);
		list.add(3);
		list.add(1, 4);
		list.add(1, 5);
		list.print();
		
	
	}

}
