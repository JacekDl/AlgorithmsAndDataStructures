package lists;

public class LinkedList {

	private Node first;
	
	public void add(int value) {
		Node current = first; 			// points to first reference/node of LinkedList
		if (current == null) { 			// checks if reference points to object class Node
										// if reference points to null (no object)
			first = new Node(value); 	// creates new Node with value - it's going to be the first node (head) of
			// LinkedList
			return;
		}
		while (current.next != null) { 	// checks if node has the following node
			current = current.next;
		}
		current.next = new Node(value);
	}

	public void print() {
		Node current = first;
		if (current == null) {
			return;
		}

		while (current.next != null) { 	// checks if node has the following node
			System.out.println(current.value);
			current = current.next;
		}
		System.out.println(current.value);
	}

	public void removeLast() {
		Node current = first;
		if (current == null) { 			//checks if LinkedList contains any Nodes, if false returns
			return;
		}
		if (current.next == null) { 	//checks if LinkedList contains single Node
			first = null;				//if true points reference first to null
			return;
		}
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
			
		
	}
	
	public void removeFirst() {
		Node current = first;
		if (current == null) { 			//checks if LinkedList contains any Nodes, if false returns
			return;
		}
		if (current.next == null) { 	//checks if LinkedList contains single Node
			first = null;				//if true points reference first to null
			return;
		}else {
			first = current.next;
		}
	}
	
	// removes first elem with given value
	public void remove(int value) {
		Node current = first;
		if (current == null) {
			return;
		}
		if(current.next == null && current.value == value) { //intructions for 1-element LinkedList with searched value
			first = null;
		}else if (current.next == null && current.value != value) { //instructions for 1-element LinkedList without searched value
			return;
		}
		if(current.value == value) { 
			first = current.next;
			return;
		}
		while (current.next.next != null && current.next.value != value) { //crawls through the list looking for value or end of list
			current = current.next;	
		}
		if (current.next.value == value) { //checks if the next element is searched value and removes it if true
		current.next = current.next.next;
		}
	}

	public void insert(int position, int value) {

	}

	private void insertRec() {

	}

	private void insertIter(int value, int positionDiff) {

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

}
