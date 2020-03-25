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
		BSTreeNode nodeToDelete = findValue(i);
		if(nodeToDelete.getLeft() == null) transplantNode(nodeToDelete, nodeToDelete.getRight()); 		//deals with nodes with no children and nodes with right child but without left child
		else if(nodeToDelete.getRight() == null) transplantNode(nodeToDelete, nodeToDelete.getLeft());	//deals with nodes with left child but without right child
		else {																							//deals with nodes with two children 
			BSTreeNode successor = findMinimum(nodeToDelete.getRight());
			if(successor.getParent() != nodeToDelete) {
				transplantNode(successor, successor.getRight());
				successor.setRight(nodeToDelete.getRight());
				successor.getRight().setParent(successor);
			}
			transplantNode(nodeToDelete, successor);
			successor.setLeft(nodeToDelete.getLeft());
			successor.getLeft().setParent(successor);
		}
	}
	
	private void transplantNode(BSTreeNode nodeToDelete, BSTreeNode successor) {		//algorithm from Cormen
		if(nodeToDelete.getParent() == null) root = successor;
		else if(nodeToDelete == nodeToDelete.getParent().getLeft()) nodeToDelete.getParent().setLeft(successor);	//checks if nodeToDelete is parent's left or right child
		else nodeToDelete.getParent().setRight(successor);	//if(nodeToDelete == nodeToDelete.getParent().getRight()) 
		if(successor != null) successor.setParent(nodeToDelete.getParent());
	}
	
	public void delete(int i ) {	//my algorithm - not finished --> it's a bit complicated and doesn't set references correctly --> abandon for now
		BSTreeNode nodeToDelete = findValue(i);
		if(nodeToDelete.hasNoChildren()) {			//procedure for nodes without children
			deleteNodeWithoutChildren(nodeToDelete);
		}
		if(nodeToDelete.hasOneChild()) {			//procedure for nodes with one child
			deleteNodeWithOneChild(nodeToDelete);
		}
		else {								//procedure for nodes with two children
			BSTreeNode successor = findSuccessor(nodeToDelete);
			if(nodeToDelete.getRight() == successor){		//in case successor is current's right child (hasn't got left child)
				BSTreeNode parent = nodeToDelete.getParent();
				if(parent == null) {		//in case searched for value is root of BSTree
					successor.setLeft(nodeToDelete.getLeft());
					root = successor;
				}else{						//in case searched for value has a parent (isn't root of BSTree)
					successor.setLeft(nodeToDelete.getLeft());		//TODO:	double check: doesn't work entirely!!!
					parent.setRight(successor);
				}
			}else{
				
			}
		}
		
	}
	
	private void deleteNodeWithoutChildren(BSTreeNode nodeToDelete) {
		BSTreeNode parent = nodeToDelete.getParent();
		if(parent == null) root = null;		//in case there is only one node(root) with searched for value
		if(parent.getLeft() == nodeToDelete) parent.setLeft(null); 
		else parent.setRight(null);
	}
	
	private void deleteNodeWithOneChild(BSTreeNode nodeToDelete) {
		BSTreeNode parent = nodeToDelete.getParent();
		if(parent == null) {																	//in case the root has only one child (two nodes in BSTree)
			if(nodeToDelete.getLeft() != null) root = nodeToDelete.getLeft();					//set root to a left child
			if(nodeToDelete.getRight() != null) root = nodeToDelete.getRight();					//set root to a right child
		}
		else {
			if(parent.getRight() == nodeToDelete) {												//current is parent's right child
				if(nodeToDelete.getRight() != null) {
					parent.setRight(nodeToDelete.getRight()); 									//refer parent right to nodeToDelete right child
					nodeToDelete.getRight().setParent(parent); 									//and nodeToDelete right child to parent (no references to nodeToDelete)
				}
				else {
					parent.setRight(nodeToDelete.getLeft());									//refer parent right to current left child (delete current)
					nodeToDelete.getLeft().setParent(parent);
				}
			}
			if(parent.getLeft() == nodeToDelete) {												//current is parent's left child
				if(nodeToDelete.getLeft() != null) {
					parent.setLeft(nodeToDelete.getLeft());										//refer parent left to current left child (delete current)
					nodeToDelete.getLeft().setParent(parent);
				}
				else {
					parent.setLeft(nodeToDelete.getRight());									//refer parent left to current right child (delete current)
					nodeToDelete.getRight().setParent(parent);
				}
			}
		}
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
	
	/////	HEIGHT	/////////////////////////////////////////////////////////////////////////////////////////////////
	public int getHeight(BSTreeNode current) {
		if(current == null) return -1;
		else return 1 + Math.max(getHeight(current.getLeft()), getHeight(current.getRight()));
	}
	
}	
	
	

