package lists;

public class LinkedList<T> {

	private Node<T> first;

	///// ADDS VALUE TO THE END OF LINKEDLIST
	public void add(T value) {
		if (first == null) { // checks if ref points to object class Node
			first = new Node<T>(value); // creates new Node with value - it's going to be the first node (head)
			return;
		}
		Node<T> current = first; // points to first reference/node of LinkedList
		while (current.getNext() != null) { // checks if node has the following node
			current = current.getNext();
		}
		current.setNext(new Node<T>(value)); // current.next = new Node(value);
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

	///// REMOVES LAST ELEMENT OF THE LINKEDLIST
	public void removeLast() {
		if (first == null) { // checks if LinkedList contains any Nodes, if false returns
			return;
		}
		if (first.getNext() == null) { // checks if LinkedList contains single Node
			first = null; // if true points reference first to null
			return;
		}
		Node<T> current = first;
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		current.setNext(null);

	}

	// -------------- Good job! TODO - mention about exceptions
	///// REMOVES FIRST ELEMENT OF THE LINKEDLIST
	public void removeFirst() {
		if (first == null) { // checks if LinkedList contains any Nodes, if false returns
			return;
		}
		Node<T> current = first;
		if (current.getNext() == null) { // checks if LinkedList contains single Node
			first = null; // if true points reference first to null
			return;
		} else {
			first = current.getNext();
		}
	}

	// -------------- Good job! TODO - Mention about cyclomatix complexity & code
	// metrics & Ratajczak style
	///// REMOVES FIRST ELEMENT WITH GIVEN VALUE
	public void remove(T value) {
		if (first == null) {//LinkedList is empty
			return;
		}
		if (first.getNext() == null && first.getValue() == value) { // LinkedList contains 1 element
			first = null;
		} else if (first.getNext() == null && first.getValue() != value) {
			return;
		}
		if (first.getValue() == value) { // if first node value is searched value that node is removed
			first = first.getNext();
			return;
		}
		Node<T> current = first;
		while (current.getNext().getNext() != null && current.getNext().getValue() != value) { // crawls through the list looking for
																				// value
																				// or end of list
			current = current.getNext();
		}
		if (current.getNext().getValue() == value) { // checks if the next element is searched value and removes it if true
			current.setNext(current.getNext().getNext()); // current.next = current.next.next;
		}
	}

//    //removes first elem with given value
//    public void remove(int value) {
//
//        if (first != null && first.getValue() == value) {
//            first = first.getNext();
//            return;
//        }
//
////        removeIter(value);
//        removeRec(null, first, value);
//    }
//
//    private void removeIter(int value) {
//        Node prev = null;
//        Node curr = first;
//
//        while (curr != null && curr.getValue() != value) {
//            prev = curr;
//            curr = curr.getNext();
//        }
//
//        if (curr != null) {
//            prev.setNext(curr.getNext());
//        }
//    }
	
	

	public void insert(int position, T value) {

		if (first == null && position == 0) { // adds value to empty LinkedList if position equals 0
			first = new Node<T>(value);
		} else if (first == null) { // or returns if position different than 0
			return;
		}

		Node<T> current = first;
		if (position == 0) { // adds value to the front of LinkedList
			first = new Node<T>(value);
			first.setNext(current); // first = current;
			return;
		}

		int counter = 0;
		// -------------- you should stop iterating through the list, when you reach
		// expected position - what if you want
		// to put the value on position ~5, and the list has 999999999 elements? ->
		// counter goes to while(...) loop
		while (current.getNext() != null  ) { // inserts value to the middle of LinkedList
			if (position == counter + 1) {
				Node<T> nodeToInsert = new Node<T>(value);
				nodeToInsert.setNext(current.getNext());// =nodeToInsert.next = current.next;
				current.setNext(nodeToInsert);// =current.next = nodeToInsert;
			}
			current = current.getNext();
			counter++;
		}
		if (current.getNext() == null && position == counter + 1) { // adds value to the end of LinkedList if position within
																// range
			Node<T> nodeToInsert = new Node<T>(value);
			current.setNext(nodeToInsert); //=current.next = nodeToInsert;
		} else if (position > counter + 1) {
			return;
		}

	}
	
//    public void insert(int position, int value) {
//        if (first == null && position != 0 || position < 0) {
//            throw new IllegalArgumentException("...");
//        } else if (position == 0) {
//            first = new Node(first, value);
//            return;
//        }
//
//        insertIter(first, first.getNext(), position - 1, value);
//
//    }
//    private void insertIter(int value, int positionDiff) {
//
//
//        Node prev = null;
//        Node curr = first;
//
//        while (positionDiff > 0 && curr != null) {
//            prev = curr;
//            curr = curr.getNext();
//            positionDiff--;
//        }
//
//        if (positionDiff > 0) {
//            throw new IllegalArgumentException("...");
//        }
//
//        prev.setNext(new Node(prev.getNext(), value));
//
//    }

	/*
	  private void insertRec() {
	  
	  }
	 

	
	  private void insertIter(int value, int positionDiff) {
	  
	  }
	 

	
	  private void removeIter(int value) {
	  
	  }
	 

	
	  private void removeRec() {
	  
	  }
	 */

	public void removeAll(T value) {
		Node<T> current = first;
		if (current == null) { // checks if LinkedList is empty
			return;
		}

		if (current.getNext() == null && current.getValue() == value) { // checks if LinkedList contains 1 element with
																	// searched
																	// value
			first = null;
		} else if (current.getNext() == null) { // checks if LinkedList contains 1 element different than searched value
			return;
		}

		while (current.getValue() == value) { // removes searched values from beginning of LinkedList, and moved
												// first(head)
												// reference
			first = current.getNext();
			current = current.getNext();
		}

		while (current.getNext().getNext() != null) { // checks if next node to current isn't end of LinkedList
			if (current.getNext().getValue() == value) { // check if next node to current contains searched value
				current.setNext(current.getNext().getNext());// =current.next = current.next.next; 
				// if true sets current.next reference to next node and checks while statement again
			} else {
				current = current.getNext();
			}
		}
		if (current.getNext().getValue() == value) { // checks if last element is the searched value
			current.setNext(null); // =current.next = null; // if true removes it
		}

	}

	
//	  private void removeAllIter(int value) {
//	  
//	  }
	 

	// naive, normally done with private variable
	public int size() {

		// -------------- can be simplier
		int counter = 1;
		Node<T> current = first;
		if (current == null) { // LinkedList empty
			counter = 0;
			return counter;
		}
		if (current.getNext() == null) {
			return counter;
		}

		while (current.getNext() != null) {
			current = current.getNext();
			counter++;
		}
		return counter;
	}

	
	 /* private int sizeRec(Node node, int accumulator) {
	  
	  }
	 

	
	  private int sizeIter() {
	  
	  }
	 */

	// -------------- can be simplier
	public void add(T[] values) {
		/////first implementation:
		/*if (first == null) { // empty LinkedList
			first = new Node<T>(values[0]);
			for (int i = 1; i < values.length; i++) {
				this.add(values[i]);
			}
			return;
		}
		if (first.getNext() == null) { // 1-element LinkedList
			for (int i = 0; i < values.length; i++) {
				this.add(values[i]);
			}
			return;
		}
		for (int i = 0; i < values.length; i++) {
			this.add(values[i]);
		}*/
		
		/////second implementation:
		Node<T> current = first;
		if(first == null) {
			first = new Node<T>(null);
		}
		while (current.getNext() != null) {// searches for end of LinkedList
			current = current.getNext();
		}
		for (int i = 0; i < values.length; i++) {
			this.add(values[i]);
		}
		//TODO: convert array to LinkedList and add it to current LinkedList
		

	}

}
