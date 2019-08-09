package queue;

public class QueueUsingArray {

	private int head = 0;
	private int tail = 0;
	private boolean isFull = false;
	private boolean isEmpty = true;
	private int[] array;

	public QueueUsingArray(int size) {
		this.array = new int[size];
	}

	public void enqueue(int i) {
		if(tail == head && isFull == true) return;
		array[tail] = i;
		if(tail == array.length-1) tail = 0;
		else tail++;
		if(tail == head){
			System.out.println("Queue full.");
			isFull = true;
		}
	}

	public int dequeue() {
		if(head == array.length-1) {
			head = 0;
			if(head == tail) {
				isEmpty = true;
			}
			return array[array.length-1];
		}else {
			head++;
			if(head == tail) {
				isEmpty = true;
			}
			return array[head-1];
		}
	}

	public void print() {
		
		if(head < tail) {
			for(int i = head; i < tail; i++) {
				System.out.print(array[i] + " ");
			}
		}else if (head > tail) {
			for(int i = head; i < array.length; i++) System.out.print(array[i] + " ");
			for(int i = 0; i < tail; i++) System.out.print(array[i] + " ");
		}else if (head == tail && isFull) {
			for(int i = head; i < array.length; i++) System.out.print(array[i] + " ");
			for(int i = 0; i < tail; i++) System.out.print(array[i] + " ");
		}
	}
}
