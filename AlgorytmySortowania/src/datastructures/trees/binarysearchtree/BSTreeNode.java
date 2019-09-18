package datastructures.trees.binarysearchtree;

public class BSTreeNode {
	
	private int value;
	private BSTreeNode left;
	private BSTreeNode right;
	private BSTreeNode parent;
	
	//constructor - in use before introduction of parent BSTreeNode 
	/*public BSTreeNode(int value) {
		this.value = value;
	}*/

	//constructor of any node
	public BSTreeNode(int value, BSTreeNode parent) {
		this.value = value;
		this.parent = parent;
	}

	//int
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	//left
	public BSTreeNode getLeft() {
		return left;
	}
	
	public void setLeft(BSTreeNode left) {
		this.left = left;
	}
	
	//right
	public BSTreeNode getRight() {
		return right;
	}
	
	public void setRight(BSTreeNode right) {
		this.right = right;
	}
	
	//parent
	public BSTreeNode getParent() {
		return parent;
	}

	public void setParent(BSTreeNode parent) {
		this.parent = parent;
	}
	
	public boolean hasRight() {		//not used
		if(right != null) return true;
		else return false;
	}
	
	public boolean hasLeft() {		//not used
		if(left != null) return true;
		else return false;
	}
	
	public boolean hasNoChildren() {
		if(left == null && right == null) return true;
		else return false;
	}
	
	public boolean hasOneChild() {
		if(left != null && right == null) return true;
		if(left == null && right != null) return true;
		else return false;
	}
}
