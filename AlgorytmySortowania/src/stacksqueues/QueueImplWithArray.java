package stacksqueues;

public class QueueImplWithArray<T>implements Queue<T> {

	private T[] array;
	private int size = 0;
	
	public QueueImplWithArray(T[] val) {
		this.array = val;
	}
	@Override
	public void push(T value) {
		array[size] = value;
		size++;
	}

	@Override
	public T peek() {
		return array[0];
	}

	@Override
	public T poll() {
		if (size == 0) {
			System.out.println("Queue empty.");
			return null;
		}
		T first = array[0];
		for (int i = 0; i < size-1; i++) {
			array[i] = array[i+1];
		}
		array[size-1] = null;
		size--;
		return first;
	}

	@Override
	public void print() {
		for (T i : array) {
			System.out.print(i + " ");
		}
	System.out.println();
	}

}
