package lists;

public class LinkedListTester {
	public static void main(String[] args) {
	
		LinkedList<Integer> nextList = new LinkedList<Integer>();
		nextList.add(11);
		nextList.add(12);
		nextList.add(13);
		nextList.add(14);
		nextList.add(15);
		nextList.add(16);

		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.removeLast();
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.removeFirst();
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.remove(12);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.insert(0, 12);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
//		int[] intList = new int[] {11,11,11,21,22,23}; //TODO how to create generic list?
//		nextList.add(intList);
//		nextList.add(11);
//		nextList.print();
//		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.removeAll(11);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		///////////
		/*LinkedList<Character> charList = new LinkedList<Character>();
		charList.add('a');
		charList.add('b');
		charList.add('c');
		charList.add('d');
		charList.add('e');
		charList.add('f');

		charList.print();
		System.out.println("LinkedList size is: " + charList.size());
		
		charList.removeLast();
		charList.print();
		System.out.println("LinkedList size is: " + charList.size());
		
		charList.removeFirst();
		charList.print();
		System.out.println("LinkedList size is: " + charList.size());
		
		charList.remove('b');
		charList.print();
		System.out.println("LinkedList size is: " + charList.size());
		
		charList.insert(0, 'c');
		charList.print();
		System.out.println("LinkedList size is: " + charList.size());
		
//		char[] nextArrayList = new char[] {'a','a','a','k','l','m'}; //TODO how to create generic list?
//		charList.add(nextArrayList);
//		charList.add('a');
//		charList.print();
//		System.out.println("LinkedList size is: " + charList.size());
		
		charList.removeAll('c');
		charList.print();
		System.out.println("LinkedList size is: " + charList.size());*/
		
		LinkedList<String> nameList = new LinkedList<String>();
		nameList.add("Jacek");
		nameList.add("Ola");
		nameList.add("Józef");
		nameList.print();
		System.out.println("LinkedList size is: " + nameList.size());
		
		nameList.removeFirst();
		nameList.print();
		System.out.println("LinkedList size is: " + nameList.size());
		
		nameList.insert(1, "Jacek");
		nameList.insert(1, "Jacek");
		nameList.insert(4, "Jacek");
		nameList.print();
		System.out.println("LinkedList size is: " + nameList.size());
		
		nameList.removeAll("Jacek");
		nameList.print();
		System.out.println("LinkedList size is: " + nameList.size());
		
		/*Node myNode = new Node(15);
		System.out.println(myNode.getValue());
		myNode.setValue(16);
		System.out.println(myNode.getValue());
		Node nextNode = new Node(17);
		myNode.setNext(nextNode);
		System.out.println(myNode.getValue() + " " +nextNode.getValue());*/
	}
}
