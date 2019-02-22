package lists;

public class LinkedList {

	private Node first;

	///// ADDS VALUE TO THE END OF LINKEDLIST
	public void add(int value) {
		Node current = first; // points to first reference/node of LinkedList
		if (current == null) { // checks if reference points to object class Node
								// if reference points to null (no object)
			first = new Node(value); // creates new Node with value - it's going to be the first node (head) of
			// LinkedList
			return;
		}
		while (current.next != null) { // checks if node has the following node
			current = current.next;
		}
		current.next = new Node(value);
	}

	///// PRINTS LINKEDLIST
	public void print() {
		Node current = first;
		if (current == null) {
			return;
		}

		while (current.next != null) { // checks if node has the following node
			System.out.print(current.value + " ");
			current = current.next;
		}
		System.out.println(current.value);
	}

	public void removeLast() {
		Node current = first;
		if (current == null) { // checks if LinkedList contains any Nodes, if false returns
			return;
		}
		if (current.next == null) { // checks if LinkedList contains single Node
			first = null; // if true points reference first to null
			return;
		}
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;

	}

	public void removeFirst() {
		Node current = first;
		if (current == null) { // checks if LinkedList contains any Nodes, if false returns
			return;
		}
		if (current.next == null) { // checks if LinkedList contains single Node
			first = null; // if true points reference first to null
			return;
		} else {
			first = current.next;
		}
	}

	// removes first elem with given value
	public void remove(int value) {
		Node current = first;
		if (current == null) {
			return;
		}
		if (current.next == null && current.value == value) { // intructions for 1-element LinkedList with searched
																// value
			first = null;
		} else if (current.next == null && current.value != value) { // instructions for 1-element LinkedList without
																		// searched value
			return;
		}
		if (current.value == value) { // if first node value is searched value that node is removed
			first = current.next;
			return;
		}
		while (current.next.next != null && current.next.value != value) { // crawls through the list looking for value
																			// or end of list
			current = current.next;
		}
		if (current.next.value == value) { // checks if the next element is searched value and removes it if true
			current.next = current.next.next;
		}
	}

	public void insert(int position, int value) {
		Node current = first;
		int counter = 0;

		if (current == null && position == 0) { // adds value to empty LinkedList if position equals 0
			first = new Node(value);
		} else if (current == null) { // or returns if position different than 0
			return;
		}

		if (position == 0) { // adds value to the front of LinkedList
			first = new Node(value);
			first.next = current;
			return;
		}

		while (current.next != null) { // inserts value to the middle of LinkedList
			if (position == counter + 1) {
				Node nodeToInsert = new Node(value);
				nodeToInsert.next = current.next;
				current.next = nodeToInsert;
			}
			current = current.next;
			counter++;
		}
		if (current.next == null && position == counter + 1) { // adds value to the end of LinkedList if position within
																// range
			Node nodeToInsert = new Node(value);
			current.next = nodeToInsert;
		} else if (position > counter + 1) {
			return;
		}

	}

	/*
	 * private void insertRec() {
	 * 
	 * }
	 */

	/*
	 * private void insertIter(int value, int positionDiff) {
	 * 
	 * }
	 */

	/*
	 * private void removeIter(int value) {
	 * 
	 * }
	 */

	/*
	 * private void removeRec() {
	 * 
	 * }
	 */

	public void removeAll(int value) {
		Node current = first;
		if (current == null) { // checks if LinkedList is empty
			return;
		}

		if (current.next == null && current.value == value) { // checks if LinkedList contains 1 element with searched
																// value
			first = null;
		} else if (current.next == null) { // checks if LinkedList contains 1 element different than searched value
			return;
		}

		while (current.value == value) { // removes searched values from beginning of LinkedList, and moved first(head)
											// reference
			first = current.next;
			current = current.next;
		}

		while (current.next.next != null) { // checks if next node to current isn't end of LinkedList
			if (current.next.value == value) { // check if next node to current contains searched value
				current.next = current.next.next; // if true sets current.next reference to next node and checks while
													// statement again
			} else {
				current = current.next;
			}
		}
		if (current.next.value == value) { // checks if last element is the searched value
			current.next = null; // if true removes it
		}

	}

	/*
	 * private void removeAllIter(int value) {
	 * 
	 * }
	 */

	// naive, normally done with private variable
	public int size() {
		int counter = 1;
		Node current = first;
		if (current == null) { // LinkedList empty
			counter = 0;
			return counter;
		}
		if (current.next == null) {
			return counter;
		}

		while (current.next != null) {
			current = current.next;
			counter++;
		}
		return counter;
	}

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
		Node current = first;
		if (current == null) { //empty LinkedList
			first = new Node(values[0]);
			for (int i = 1; i < values.length; i++) {
				this.add(values[i]);
			}
			return;
		}
		if (current.next == null) { //1-element LinkedList
			for (int i = 0; i < values.length; i++) {
				this.add(values[i]);
			}
			return;
		}
		while (current.next != null) {//searches for end of LinkedList
			current = current.next;
		}
		for (int i = 0; i < values.length; i++) {
			this.add(values[i]);
		}

	}

}
