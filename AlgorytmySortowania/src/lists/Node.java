package lists;

public class Node<T> {

	private T value;
	private Node next;

	public Node(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
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
