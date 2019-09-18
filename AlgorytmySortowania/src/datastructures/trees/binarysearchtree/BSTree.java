package datastructures.trees.binarysearchtree;

public class BSTree {

	private BSTreeNode root;
	
	
	public BSTreeNode getRoot() {
		return root;
	}

	public void setRoot(BSTreeNode root) {
		this.root = root;
	}
	/////	ADD VALUE	///////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void add(int value) {
		addFirstElement(value);
		BSTreeNode current = root;
		addNextElement(current, value);
	}
	
	private void addFirstElement(int value) {
		if (root == null) {
			root = new BSTreeNode(value, null);
		}
	}
	
	private void addNextElement(BSTreeNode current, int value){
		if (current.getValue() > value) { //current.getValue() >= value for unique values(no duplicates)
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
		else if (current.getValue() == value){ //TODO: currently it prints this message twice(1st when it finds matching value, 2nd when it finishes the loop)
			//System.out.println("This value already exists in BSTree.");
			return;
		}
	}
	
	public void addValues(int[] values) {
		for(int i : values) {
			add(i);
		}
	}
	
	/////	DELETE VALUE	//////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void deleteNode(int i) {				//algorithm from Cormen
		BSTreeNode current = findValue(i);
		if(current.getLeft() == null) transplantNode(current, current.getRight());
		else if(current.getRight() == null) transplantNode(current, current.getLeft());
		else {
			BSTreeNode successor = findMinimum(current);
			if(successor.getParent() != current) {
				transplantNode(successor, successor.getRight());
				successor.setRight(current.getRight());
				successor.getRight().setParent(successor);
			}
			transplantNode(current, successor);
			successor.setLeft(current.getLeft());
			successor.getLeft().setParent(successor);
		}
	}
	
	private void transplantNode(BSTreeNode current, BSTreeNode successor) {		//algorithm from Cormen
		if(current.getParent() == null) root = successor;
		else if(current == current.getParent().getLeft()) current.getParent().setLeft(successor);
		else current.getParent().setRight(successor);
		if(successor != null) successor.setParent(current.getParent());
	}
	
	public void delete(int i ) {	//my algorithm - not finished
		BSTreeNode current = findValue(i);
		if(current.hasNoChildren()) {		//procedure for nodes without children
			deleteNodeWithoutChildren(current);
		}
		if(current.hasOneChild()) {			//procedure for nodes with one child
			deleteNodeWithOneChild(current);
		}
		else {
			BSTreeNode successor = findSuccessor(current);
			if(current.getRight() == successor){		//in case successor is current's right child (hasn't got left child)
				BSTreeNode parent = current.getParent();
				if(parent == null) {		//in case searched for value is root of BSTree
					successor.setLeft(current.getLeft());
					root = successor;
				}else{						//in case searched for value has a parent (isn't root of BSTree)
					successor.setLeft(current.getLeft());		//TODO:	double check: doesn't work entirely!!!
					parent.setRight(successor);
				}
			}else {
				
			}
		}
		
	}
	
	private void deleteNodeWithOneChild(BSTreeNode current) {
		BSTreeNode parent = current.getParent();
		if(parent == null) {	//in case the root has only one child (two nodes in BSTree)
			if(current.getLeft() != null) root = current.getLeft();			//set root to a left child
			if(current.getRight() != null) root = current.getRight();		//set root to a right child
		}
		else {
			if(parent.getRight() == current) {			//current is parent's right child
				if(current.getRight() != null) parent.setRight(current.getRight()); //refer parent right to current right child (delete current)
				else parent.setRight(current.getLeft());							//refer parent right to current left child (delete current)
			}
			if(parent.getLeft() == current) {			//current is parent's left child
				if(current.getLeft() != null) parent.setLeft(current.getLeft());	//refer parent left to current left child (delete current)
				else parent.setLeft(current.getRight());							//refer parent left to current right child (delete current)
			}
		}
	}

	private void deleteNodeWithoutChildren(BSTreeNode current) {
		BSTreeNode parent = current.getParent();
		if(parent == null) root = null;		//in case there is only one node(root) with searched for value
		if(parent.getLeft() == current) parent.setLeft(null); 
		else parent.setRight(null);
	}

	///// CALCULATE SUM OF VALUES	//////////////////////////////////////////////////////////////////////////////////////////////
	
	public int sum() {
		int answer = sum(root);
		return answer;
	}
	
	private int sum(BSTreeNode current) {
		if(current != null) return sum(current.getLeft()) + current.getValue() + sum(current.getRight());  
		return 0;
	}
	
	
	/////	GET SIZE	////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//public int getSize() {}

	/////	GET NUMBER OF ELEMENTS	///////////////////////////////////////////////////////////////////////////////////////////
	
	public int getNumberOfElements() {
		int answer = numberOfElements(root);
		return answer;
	}
	
	private int numberOfElements(BSTreeNode current) {
		if(current != null) return numberOfElements(current.getLeft()) + 1 + numberOfElements(current.getRight());
		return 0;
	}
	

	/////	TREE WALK	///////////////////////////////////////////////////////////////////////////////////////////////

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

	
	/////	FIND VALUE	////////////////////////////////////////////////////////////////////////////////////////////
	public BSTreeNode findValue(int i) {	//finds value and returns reference to it (null if value not found)
		BSTreeNode current = root;
		BSTreeNode foundValue = findValue(current, i);
		if(foundValue != null) System.out.println("We have found your value!");
		else System.out.println("Value not found.");
		return foundValue;
	}

	private BSTreeNode findValue(BSTreeNode current, int i) {
		if(current == null || i == current.getValue()) {
			return current;
		}
		if(i < current.getValue()) {
			return findValue(current.getLeft(), i);
		}else{
			return findValue(current.getRight(), i);
		}
	}

	/////	FIND MINIMUM	//////////////////////////////////////////////////////////////////////////////////////////
	
	public BSTreeNode findMinimum() {		///find minimum of whole tree
		BSTreeNode current = root;
		while(current.getLeft() != null) current = current.getLeft();
		return current;
	}
	
	private BSTreeNode findMinimum(BSTreeNode node) {	//find minimum of subtree (node = root)
		while(node.getLeft() != null) node = node.getLeft();
		return node;
		
	}
	
	public BSTreeNode findMinimumByRecursion(BSTreeNode current) {	//find minimum of subtree by recursion
		if(current == null) return current;
		return findMinimumByRecursion(current.getLeft());
	}

	/////FIND MAXIMUM//////////////////////////////////////////////////////////////////////////////////////////
	
	public BSTreeNode findMaximum() {		///find maximum of whole tree
		BSTreeNode current = root;
		while(current.getRight() != null) current = current.getRight();
		return current;
	}
	
	private BSTreeNode findMaximum(BSTreeNode node) {	//find maximum of subtree (node = root)
		while(node.getRight() != null) node = node.getRight();
		return node;
		
	}
	
	public BSTreeNode findMaximumByRecursion(BSTreeNode current) {	//find maximum of subtree by recursion
		if(current == null) return current;
		return findMinimumByRecursion(current.getRight());
	}
	
	/////	FIND SUCCESSOR	/////////////////////////////////////////////////////////////////////////////////////////
	public BSTreeNode findSuccessor(int i) {
		BSTreeNode current = findValue(i);	//finds value (can refer to null if value not found)
		if(current != null) {				//if refers not to null carry on procedure
			if(current.getRight() != null) return findMinimum(current.getRight());	//if there is a node on the right
																					//find minimum in subtree on the right
																					
			BSTreeNode successor = current.getParent();	//if unsuccessful creates extra reference which refers to node's parent
			while(successor != null && current == successor.getRight()) {	//moves up the tree until it finds first node which right node isn't current 
				current = successor;
				successor = successor.getParent();
			}
			return successor;
		}
		else return current;				//else (if current refers to null) return current
	}
	
	private BSTreeNode findSuccessor(BSTreeNode current) {
		if(current != null) {				//if refers not to null, then carry on procedure
			if(current.getRight() != null) return findMinimum(current.getRight());	//if there is a node on the right
																					//find minimum in subtree on the right
																					
			BSTreeNode successor = current.getParent();	//if unsuccessful creates extra reference which refers to node's parent
			while(successor != null && current == successor.getRight()) {	//moves up the tree until it finds first node which right node isn't current 
				current = successor;
				successor = successor.getParent();
			}
			return successor;
		}
		else return current;				//else (if current refers to null) return current
	}
	
	/////	FIND PREDECESSOR	//////////////////////////////////////////////////////////////////////////////////////
	public BSTreeNode findPredecessor(int i) {
		BSTreeNode current = findValue(i);
		if(current != null) {
			if(current.getLeft() != null) return findMaximum(current.getLeft());
			BSTreeNode predecessor = current.getParent();
			while(predecessor != null && current == predecessor.getLeft()) {
				current = predecessor;
				predecessor = predecessor.getParent();
			}
			return predecessor;
			
		}
		else return current;
	}
	
	
}	
	
	

