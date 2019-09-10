package datastructures.stacksqueues;

import datastructures.linkedlists.*; 

public class StackImplWithList<T> implements Stack<T> {

	private LinkedList<T> myLinkedList;
	
	public StackImplWithList() {
		myLinkedList = new LinkedList<>();
	}
	
	@Override
	public void push(T value) {
		myLinkedList.add(value);
		
	}
	
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void peek() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	/*private Node<T> first;

	///// Adds value to the top
	public void push(T value) {
		if (first == null) {
			first = new Node<T>(value);
		} else {
			Node<T> node = new Node<T>(value);
			node.setNext(first); // = node.next = first;
			first = node;
		}
	}

	///// Removes value from the top
	public T pop() {
		if (first == null) {
			System.out.println("Stack is empty.");
			return null;
		}
		Node<T> node = first;
		first = first.getNext();
		return node.getValue();
	}

	///// Prints value from the top
	public void peek() {
		try {
			System.out.println(first.getValue()); // TODO catch StackEmptyExemption
		} catch (NullPointerException exc) {
			System.out.println("Stack is empty");
		}
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
	*/
}