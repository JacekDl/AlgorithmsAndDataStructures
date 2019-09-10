package datastructures.trees.binarysearchtree;

public class BSTree {

	private BSTreeNode root;
	
	
	public BSTreeNode getRoot() {
		return root;
	}

	public void setRoot(BSTreeNode root) {
		this.root = root;
	}

	public void add(int value) {
		addFirstElement(value);
		BSTreeNode current = root;
		addNextElement(current, value);
	}
	
//  public void print() 
	
	public void sum() {
		BSTreeNode current = root;
		int answer = 0;
		System.out.println(sumOfElements(current, answer));
	}
	
	private int sumOfElements(BSTreeNode current, int answer) {
		while (current.getLeft() != null && current.getRight() != null) {
			if (current.getLeft() == null) {
				answer = current.getValue() + sumOfElements(current.getRight(), answer);
			}
			if (current.getRight() == null) {
				answer = current.getValue() + sumOfElements(current.getLeft(), answer);
			}
			else {
				answer = current.getValue() + sumOfElements(current.getLeft(), answer) + sumOfElements(current.getRight(), answer);
			}
		}
		return answer;
	}
//	public int getSize() {}
//	public T getMinValue() {}
//	public T getMaxValue() {}
//	public int getNumberOfElements() {}
	
	private void addFirstElement(int value) {
		if (root == null) {
			root = new BSTreeNode(value, null);
		}
	}
	
	private void addNextElement(BSTreeNode current, int value){
		if (current.getValue() > value) {
			if(current.getLeft() == null) {
				current.setLeft(new BSTreeNode(value, current)); //assigns current to new Node and new Node to current 
			}else {
				addNextElement(current.getLeft(), value);
			}
		}
		else if (current.getValue() < value) {
			if(current.getRight() == null) {
				current.setRight(new BSTreeNode(value, current));//assigns current to new Node and new Node to current 
			}else {
				addNextElement(current.getRight(), value);
			}
		}
		else{ //TODO: currently it prints this message twice(1st when it finds matching value, 2nd when it finishes the loop)
			System.out.println("This value already exists in BSTree.");
			return;
		}
	}

	//inorder tree walk recursively
	public void printValuesInorder(BSTreeNode current) { 			//begin with current(param) = root(arg)
		if(current != null) {										//if current isn't refering to null
			printValuesInorder(current.getLeft());					//first print whatever is on left side
			System.out.print(current.getValue() + " ");				//then print current.value
			printValuesInorder(current.getRight());					//then print whatever is on right side
		}
	}
	
	//inorder tree walk nonrecursive --> TODO 
	//public void printValuesNoRecursively()
	
	
	//preodred tree walk recursively
	public void printValuesPreorder(BSTreeNode current) {
		if(current != null) {
			System.out.print(current.getValue() + " ");
			printValuesPreorder(current.getLeft());
			printValuesPreorder(current.getRight());
		}
	}
	
	//postorder tree walk recursively
	public void printValuesPostorder(BSTreeNode current) {
		if(current != null) {
			printValuesPostorder(current.getLeft());
			printValuesPostorder(current.getRight());
			System.out.print(current.getValue() + " ");
		}
	}

	public BSTreeNode findValue(BSTreeNode current, int i) {
		if(current == null || i == current.getValue()) {
			return current;
		}
		if(i < current.getValue()) {
			return findValue(current.getLeft(), i);
		}else{
			return findValue(current.getRight(), i);
		}
	}
	
}	
	
	

