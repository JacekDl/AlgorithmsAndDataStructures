package stacksqueues;

public class StacksQueuesTester {

	public static void main(String[] args) {
		Stack<Integer> myStack = new StackImplWithList<>();
		
		//test 0: check the value at the top if stack is empty:
		System.out.println("Test 0: ");
		myStack.peek();
		
		//test 1: add values to the stack
		System.out.println("Test 1: ");
		myStack.push(11);
		myStack.push(12);
		myStack.push(13);
		myStack.push(14);
		myStack.print();
		
		//test 2: check the value at the top
		System.out.println("Test 2: ");
		myStack.peek();

		//test 3: remove value from the stack
		System.out.println("Test 3: ");
		myStack.pop();
		myStack.print();
		
		//test 4 remove last value from the stack:
		System.out.println("Test 4: ");
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.print();
		
		//test 5: create and manipulate stack type String
		System.out.println("Test 5:");
		StackImplWithList<String> stringStack = new StackImplWithList<>();
		stringStack.push("Jacek");
		stringStack.push("Ola");
		stringStack.push("J�zef");
		stringStack.print();
		stringStack.peek();
		stringStack.pop();
		stringStack.print();
		
	}

	
	
}