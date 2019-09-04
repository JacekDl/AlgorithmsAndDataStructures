package datastructures.trees.binarysearchtree;

public class BSTree {

	public BSTreeNode root;
	
	
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
			root = new BSTreeNode(value);
		}
	}
	
	private void addNextElement(BSTreeNode current, int value) {
		if (current.getValue() > value) {
			if(current.getLeft() == null) {
				current.setLeft(new BSTreeNode(value));
			}else {
				addNextElement(current.getLeft(), value);
			}
		}
		if (current.getValue() < value) {
			if(current.getRight() == null) {
				current.setRight(new BSTreeNode(value));
			}else {
				addNextElement(current.getRight(), value);
			}
		}
		else if (current.getValue() == value){
			//System.out.println("This value already exists in BSTree.");
			return;
		}
	}
	
	
	
	
}
