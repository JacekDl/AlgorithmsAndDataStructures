package datastructures.trees.binarysearchtree;

public class BSTreeNode {
	
	private int value;
	private BSTreeNode left;
	private BSTreeNode right;
	private BSTreeNode parent;
	
	//constructor:
	public BSTreeNode(int value) {
		this.value = value;
	}

	//int
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public BSTreeNode getLeft() {
		return left;
	}
	
	public void setLeft(BSTreeNode left) {
		this.left = left;
	}
	
	public BSTreeNode getRight() {
		return right;
	}
	
	public void setRight(BSTreeNode right) {
		this.right = right;
	}
	
	public BSTreeNode getParent() {
		return parent;
	}

	public void setParent(BSTreeNode parent) {
		this.parent = parent;
	}
}
