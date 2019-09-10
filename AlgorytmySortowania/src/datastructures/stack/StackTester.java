package datastructures.stack;

public class StackTester {

	public static void main(String[] args) {

		StackUsingArrayList<Integer> sua = new StackUsingArrayList<>();
		sua.push(12);
		sua.push(14);
		sua.push(16);
		sua.push(18);
		sua.push(20);
		sua.print();
		//System.out.println(sua.top);
		System.out.println();

		sua.push(22);
		sua.print();
		System.out.println();
		
		System.out.println(sua.peek());

		System.out.println();
		sua.pop();
		sua.pop();
		sua.pop();
		sua.pop();
		sua.pop();
		sua.print();
		System.out.println();
		
		sua.pop();
		sua.pop();
		
		
		StackUsingArray<String> names = new StackUsingArray<>();
		names.push("Jacek");
		names.push("Ola");
		names.push("Miecia");
		names.push("Stasiu");
		names.push("Jadzia");
		names.print();
		//System.out.println(sua.top);
		System.out.println();

		names.push("Grzes");
		for (int i = 0; i < 1000;i++) {
			names.push("NextName");
		}
		names.print();
		System.out.println();
		
		System.out.println(names.peek());

		System.out.println();
		names.pop();
		names.pop();
		names.pop();
		names.pop();
		names.pop();
		
		System.out.println();
		
		names.pop();
		names.pop();
		
	}
}
