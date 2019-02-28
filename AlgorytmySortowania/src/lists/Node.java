package lists;

public class Node<T> {

	private int value;
	private Node next;

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public boolean hasNext() {
		// this.next != null ? true : false;

		if (this.next != null) {
			return true;
		} else {
			return false;
		}

	}

}
