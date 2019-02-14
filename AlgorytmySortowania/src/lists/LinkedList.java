package lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	private Node first;

	/*
	 * public void add(int value) { Node current = head; Node next = new Node(); if
	 * (current.hasNext() == false) { head.value = value; head.next = next; }
	 * 
	 * }
	 */

	public void add(int value) {
		Node current = first; // points to first reference/node of LinkedList
		if ( current == null) { // checks if reference points to object class Node
								// if reference points to null (no object) 
			first = new Node(value); 	// creates new Node with value - it's going to be the first node (head) of LinkedList
			return;
		}
		while (current.next != null) { // checks if node has the following node
			current = current.next;
		}
		current.next = new Node(value);
	}

	public void insert(int position, int value) {

	}

	private void insertRec() {

	}

	private void insertIter(int value, int positionDiff) {

	}

	// removes first elem with given value
	public void remove(int value) {

	}

	private void removeIter(int value) {

	}

	private void removeRec() {

	}

	public void removeAll(int value) {

	}

	private void removeAllIter(int value) {

	}

	// naive, normally done with private variable
	/*
	 * public int size() {
	 * 
	 * }
	 */

	/*
	 * private int sizeRec(Node node, int accumulator) {
	 * 
	 * }
	 */

	/*
	 * private int sizeIter() {
	 * 
	 * }
	 */

	public void add(int[] values) {

	}

	public void print() {
		Node current = first;
		do {
			System.out.println(current.value);
			current = current.getNext();
		} while (current.hasNext());
		System.out.println(current.value);

	}

}
