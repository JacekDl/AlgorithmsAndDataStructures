package lists;

public class LinkedListTester {
	public static void main(String[] args) {
	
		LinkedList nextList = new LinkedList();
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
		
		int[] arrayList = new int[] {11,11,11,21,22,23};
		nextList.add(arrayList);
		nextList.add(11);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.removeAll(11);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		
		/*Node myNode = new Node(15);
		System.out.println(myNode.getValue());
		myNode.setValue(16);
		System.out.println(myNode.getValue());
		Node nextNode = new Node(17);
		myNode.setNext(nextNode);
		System.out.println(myNode.getValue() + " " +nextNode.getValue());*/
	}
}
