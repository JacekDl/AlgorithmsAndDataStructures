package datastructures.linkedlists;

public class LinkedListTester {
	public static void main(String[] args) {

		// test 1: create LinkedList object and add some values:
		System.out.println("Test 1: create LinkedList object and add some values:");
		LinkedList<Integer> nextList = new LinkedList<Integer>();
		nextList.add(11);
		nextList.add(12);
		nextList.add(13);
		nextList.add(14);
		nextList.add(15);
		nextList.add(16);
		nextList.print();

		// test 2: remove last value:
		System.out.println("Test 2: remove last value: ");
		nextList.removeLast();
		nextList.removeLast();
		nextList.removeLast();
		nextList.removeLast();
		nextList.removeLast();
		nextList.removeLast();
		nextList.print();

		// test 3: remove first value:
		System.out.println("Test 3: remove first value:");
		nextList.removeFirst();
		nextList.print();

		// test 4: remove specific value:
		System.out.println("Test 4: remove specific value(12):");
		nextList.remove(12);
		nextList.print();

		// test 5: insert value at the beginning:
		System.out.println("Test 5: insert value at the beginning:");
		nextList.insert(0, 12);
		nextList.print();

		// test 6: insert values in the specific position:
		System.out.println("Test 6: insert values in the specific position:");
		nextList.insert(0, 11);
		nextList.insert(0, 11);
		nextList.insert(4, 11);
		nextList.insert(2, 1000);
		nextList.print();

		// test 7: add list to LinkedList:
		System.out.println("Test 7: add list to LinkedList:");
		Integer[] intList = new Integer[] { 11, 11, 11, 21, 22, 23 }; // TODO how to create generic list? ANSWER: you
																		// cannot create generic list!
		nextList.add(intList);
		nextList.print();

		// test 8: remove all values(11):
		System.out.println("Test 8: remove all values:");
		nextList.removeAll(11);
		nextList.print();
		System.out.println();

		// test 9: create and manipulate LinkedList of type Character:
		System.out.println("Test 9: create and manipulate LinkedList of type Character:");
		LinkedList<Character> charList = new LinkedList<Character>();
		charList.add('a');
		charList.add('b');
		charList.add('c');
		charList.add('d');
		charList.add('e');
		charList.add('f');
		charList.print();

		System.out.println("Remove last element:");
		charList.removeLast();
		charList.print();

		System.out.println("Remove first element:");
		charList.removeFirst();
		charList.print();

		System.out.println("Remove specific element(b):");
		charList.remove('b');
		charList.print();

		System.out.println("Add element to the front: ");
		charList.insert(0, 'b');
		charList.print();

		System.out.println("Insert element to the middle: ");
		charList.insert(2, 'b');
		charList.print();

		System.out.println("Add array:");
		Character[] nextArrayList = new Character[] { 'b', 'b', 'b', 'k', 'l', 'm' };
		charList.add(nextArrayList);
		charList.print();

		System.out.println("Remove all elements of specific value: ");
		charList.removeAll('b');
		charList.print();

		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Jacek");
		nameList.add("Wacek");
		nameList.add("Pankracek");
		nameList.print();

		nameList.insert(1, "Jacek");
		nameList.insert(1, "Jacek");
		nameList.insert(4, "Jacek");
		nameList.print();

		String[] names = new String[] { "Ola", "Ola", "Ola" };
		nameList.add(names);
		nameList.print();

		nameList.removeAll("Jacek");
		nameList.print();

		/*
		 * Node myNode = new Node(15); System.out.println(myNode.getValue());
		 * myNode.setValue(16); System.out.println(myNode.getValue()); Node nextNode =
		 * new Node(17); myNode.setNext(nextNode); System.out.println(myNode.getValue()
		 * + " " +nextNode.getValue());
		 */
	}
}
