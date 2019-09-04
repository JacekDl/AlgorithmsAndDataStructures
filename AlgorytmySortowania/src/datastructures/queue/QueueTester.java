package datastructures.queue;

public class QueueTester {

	public static void main(String[] args) {
		
		QueueUsingArray qua = new QueueUsingArray(5);
		qua.enqueue(11);
		qua.enqueue(12);
		qua.enqueue(13);
		qua.enqueue(14);
		qua.enqueue(15);
		qua.print();
		System.out.println();
		
		qua.dequeue();
		qua.dequeue();
		qua.print();
		System.out.println();
		
		qua.enqueue(16);
		qua.print();
		System.out.println();
		
		qua.enqueue(17);
		qua.print();
		System.out.println();
		
		qua.enqueue(18);
		qua.print();
		System.out.println();
		
		/*qua.dequeue();
		qua.dequeue();
		qua.enqueue(21);
		qua.print();
		System.out.println();*/
		
	}

}
