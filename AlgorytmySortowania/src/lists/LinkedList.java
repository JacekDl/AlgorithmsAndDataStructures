package lists;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	private Node first;
	private Node last;
	
	public void add(int value) {
		
		if(last != null) {
			Node node = new Node();
			node.setValue(value);
			
			last.setNext(node);
			last = node;
		} else {
			
			Node node = new Node();
			node.setValue(value);
			
			last = node;
			first = node;
		}	
	}
	
	public void log() {
		
		Node temp = first;
		while(temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	

	}
	
}
