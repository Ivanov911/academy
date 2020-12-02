package Classwork11;

public class LinkedListCustom<T> {

	private Node<T> head;
	private Node<T> tail;
	private Integer size = 0;

	public void add(T value) {
		Node<T> node = new Node<>(value);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;

		}
		size++;

	}

	public void size() {
		
	}
	
	public void add(int index, T value) {
		Node<T> node = new Node<>(value);
		if (size < index) {
			System.out.println("Îøèáêà");
			return;
		} else if (size == index) {
			add(value);
			return;
		} else {
			Integer counter = 0;
			Node<T> current = head;
			while (counter <= index) {
				current = current.next;
				counter++;
			}
			node.next = current;
			node.prev = current.prev;
			current.prev.next = node;
			current.prev = node;

		}
	}
public void print() {
	Node<T> current = head;
	while (current.next != null) {
		System.out.println(current.value);
		current = current.next;
	}
}


	class Node<T> {
		T value;
		Node<T> next;
		Node<T> prev;

		Node(T value) {
			this.value = value;

		}
	}

}
