package stacksqueues;

public class StacksQueuesTester {

	public static void main(String[] args) {

		/*Stack<Integer> myStack = new StackImplWithList<>();

		// test 0: check the value at the top if stack is empty
		System.out.println("Test 0: ");
		myStack.peek();

		// test 1: add values to the stack 
		System.out.println("Test 1: ");
		myStack.push(11);
		myStack.push(12);
		myStack.push(13);
		myStack.push(14);
		myStack.print();

		// test 2: check the value at the top 
		System.out.println("Test 2: ");
		myStack.peek();

		// test 3: remove value from the stack 
		System.out.println("Test 3: ");
		myStack.pop();
		myStack.print();

		// test 4 remove last value from the stack 
		System.out.println("Test 4: ");
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.print();

		// test 5: create and manipulate stack type String
		System.out.println("Test 5:");
		StackImplWithList<String> stringStack = new StackImplWithList<>();
		stringStack.push("Jacek");
		stringStack.push("Wacek");
		stringStack.push("Pankracek");
		stringStack.print();
		stringStack.peek();
		stringStack.pop();
		stringStack.print();

		QueueImplWithList<Integer> myQueue = new QueueImplWithList<>();

		// test 6: returns value from the front of Queue (end of LinkedList)
		System.out.println("Test 6: returns value from the front of Queue (end of LinkedList).");
		System.out.println(myQueue.peek());
		myQueue.print();

		// test 7: add values to the end of Queue (front of LinkedList)
		System.out.println("Test 7: add values to the Queue: ");
		myQueue.push(21);
		myQueue.push(22);
		myQueue.push(23);
		myQueue.push(24);
		myQueue.print();

		// test 8: returns value from the front of Queue (end of LinkedList)
		System.out.println("Test 8: returns value from the front of Queue (end of LinkedList).");
		System.out.println(myQueue.peek());
		myQueue.print();

		// test 9: remove value from the front of Queue (end of LinkedList)
		System.out.println("Test 9: remove value from the front (end of LinkedList):");
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());

		// test 10: create and manipulate Queue using data type String
		System.out.println("Test 10: create and manipulate Queue using data type String.");
		QueueImplWithList<String> nameQueue = new QueueImplWithList<>();
		nameQueue.push("Jacek");
		nameQueue.push("Wacek");
		nameQueue.push("Pankracek");
		nameQueue.print();
		System.out.println(nameQueue.peek());
		nameQueue.print();
		System.out.println(nameQueue.poll());
		System.out.println(nameQueue.poll());
		System.out.println(nameQueue.poll());
		System.out.println(nameQueue.poll());*/
		
		// test 11: create StackImplWithArray object
		System.out.println("Test 11: create StackImplWithArray object:");
		Integer[] val = new Integer[10];
		StackImplWithArray<Integer> myStack = new StackImplWithArray<>(val);
		myStack.print();
		System.out.println();
		
		// test 12: add values to the stack (max.10) 
		System.out.println("Test 12: add values to the stack (max.10):");
		myStack.push(101);
		myStack.push(102);
		myStack.push(103);
		myStack.push(104);
		myStack.push(105);
		myStack.push(106);
		myStack.push(107);
		myStack.push(108);
		myStack.push(109);
		myStack.push(110);
//		myStack.push(111);
		myStack.print();
		System.out.println();
		
		// test 13: check the last value on the stack
		System.out.println("Test 13: check the last value on the stack:");
		myStack.peek();
		
		//test 14: remove values from the stack
		System.out.println("Test 14: remove values from the stack:");
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.print();
		
		//test : expand stack to more than 10 values
		
		
		
		
//		Integer[] newArray = new Integer[10];
//		for (Integer i : newArray) {
//			System.out.println(i);
//		}
	}

}
