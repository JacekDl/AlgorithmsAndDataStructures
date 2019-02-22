package lists;

public class LinkedListTester {
	public static void main(String[] args) {
	
		LinkedList nextList = new LinkedList();
		nextList.insert(0, 11);
		nextList.add(11);
		nextList.add(11);
		nextList.add(11);
		nextList.add(11);
		nextList.add(11);
		nextList.insert(2, 12);
		nextList.insert(2, 13);
		nextList.insert(0, 14);
		nextList.insert(0, 15);

		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		int[] arrayList = new int[] {11,22,23};
		nextList.add(arrayList);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
		nextList.removeAll(11);
		nextList.print();
		System.out.println("LinkedList size is: " + nextList.size());
		
	}
}
