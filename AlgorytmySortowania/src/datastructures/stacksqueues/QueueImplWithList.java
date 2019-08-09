package stacksqueues;

import lists.Node;

public class QueueImplWithList<T> implements Queue<T> {
	private Node<T> first;

	///// Adds value to the front of LinkedList (end of Queue)
	public void push(T value) {
		if (first == null) {
			first = new Node<T>(value);
		} else {
			Node<T> node = new Node<T>(value);
			node.setNext(first); // = node.next = first;
			first = node;
		}
	}

	///// Removes the first value of Queue (last of LinkedList) and returns it
	public T poll() {
		if (first == null) {
//			System.out.println("Queue is empty.");
			return null;
		}
		Node<T> current = first;
		if (first.getNext() == null) { // checks if LinkedList contains single Node
			first = null; 
			return current.getValue();
		}
		Node<T> previous = null;
		while (current.getNext() != null) {
			previous = current;
			current = current.getNext();
		}
		previous.setNext(null);
		return current.getValue();	
	}
	
	public T peek() {
		if (first == null) {
//			System.out.println("Queue is empty.");
			return null;
		}
		if (first.getNext() == null) { // checks if LinkedList contains single Node
			return first.getValue();
		}
		Node<T> current = first;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current.getValue();	
	}
	
	///// PRINTS LINKEDLIST
	public void print() {
		Node<T> current = first;
		if (current == null) {
			return;
		}
		while (current.getNext() != null) { // checks if node has the following node
			System.out.print(current.getValue() + " ");
			current = current.getNext();
		}
		System.out.println(current.getValue());
	}

}
