package datastructures.trees.binarysearchtree;

import testdata.TestDataGenerator;

public class BSTreeTester {

	public static void main(String[] args) {
		
		//Test 1: create BSTree (add one Node)
		BSTree firstTree = new BSTree();
		firstTree.add(10);
		//System.out.println(firstTree.getRoot().getValue());
		
		//Test 2: add 2nd BSTreeNode(2)
		firstTree.add(2);
		//System.out.println(firstTree.root.getLeft().getValue());
		
		//Test 3: add 3rd BSTreeNode(7)
		firstTree.add(7);
		//System.out.println(firstTree.root.getRight().getValue());
		
		//Test 4: add 4th BSTreeNode(1)
		firstTree.add(1);
		//System.out.println(firstTree.root.getLeft().getLeft().getValue());
		
		
		//Test 5: add 5th BSTreeNode(5)
		firstTree.add(5);
		//System.out.println(firstTree.root.getRight().getLeft().getValue());
		
		//Test 6: add more BSTreeNodes(8, 9, 4, 6)
		firstTree.add(8);
		firstTree.add(9);
		firstTree.add(4);
		firstTree.add(6);
		firstTree.add(20);
		//System.out.println(firstTree.getRoot().getRight().getLeft().getRight().getValue());
		//System.out.println(firstTree.getRoot().getRight().getLeft().getLeft().getValue());
		
		
		
		//Test 7: add BSTreeNode with value that already exists:
		//firstTree.add(3);
		
		//Test 8: get sum of elements
		//firstTree.sum();
		
		//Test 9: print values stored in BSTree (inorder)
		//firstTree.printValuesInorder(firstTree.getRoot());
		System.out.println();
		
		//Test 9.1: remove value
		/*int myValue = 5;				//TODO: there is something wrong with values 3 (changes order of BST - problem with deleteNode()) and 5(StackOverflowError - deleteNode() and no action delete()) 
		firstTree.deleteNode(myValue);
		firstTree.printValuesInorder(firstTree.getRoot());
		System.out.println();
		firstTree.add(myValue);
		firstTree.printValuesInorder(firstTree.getRoot());
		System.out.println();
		//firstTree.delete(4);
		//firstTree.delete(6);
		firstTree.delete(myValue);
		//System.out.println();
		firstTree.printValuesInorder(firstTree.getRoot());
		System.out.println();*/
		
		
		//Test 10: print values stored in BSTree (preorder)
		/*firstTree.printValuesPreorder(firstTree.getRoot());
		System.out.println();*/
		
		//Test 11: print values stored in BSTree (postorder)
		/*firstTree.printValuesPostorder(firstTree.getRoot());
		System.out.println();*/
		
		
		//TODO: using testdata class create method to add random numbers to a tree (using array) --> DONE
		//Test 12: Create BSTree and fill it in with random numbers
		BSTree secondTree = new BSTree();
		TestDataGenerator generator = new TestDataGenerator();
		secondTree.addValues(generator.generateRandomNumbers(40, 100));
		
		secondTree.printValuesInorder(secondTree.getRoot());
		System.out.println();
		
		//Very primitive way of printing BSTree - throws NullPointerException if Node == null
		System.out.println("Root of the this Binary Search Tree = " + secondTree.getRoot().getValue());
		
		/*System.out.print("  " + secondTree.getRoot().getLeft().getValue() + "  ");
		System.out.print("   " + secondTree.getRoot().getRight().getValue());
		System.out.println();
		
		System.out.print(secondTree.getRoot().getLeft().getLeft().getValue() + "  ");
		System.out.print(secondTree.getRoot().getLeft().getRight().getValue() + "  ");
		System.out.print(secondTree.getRoot().getRight().getLeft().getValue() + "  ");
		System.out.print(secondTree.getRoot().getRight().getRight().getValue() + "  ");
		System.out.println();*/
		
		//Test 13: find value //TODO: it only finds values doesn't report missing values >> done!!! findValue returns ref to searched value or ref to null if searched value is not in the tree 
		
		//				BSTreeNode myValue = firstTree.findValue(firstTree.getRoot(), 11);
		//				if(myValue != null) System.out.println("We have found your value!!!");
		//				else System.out.println("Your value is not in our tree.");
		int searchedValue = 10;
		System.out.println("Searched value = " + searchedValue);
		secondTree.findValue(searchedValue);
		
		//Test 14: find minimum value
		System.out.println("Minimum = " + secondTree.findMinimum().getValue());
		
		//Test 15: find maximum value
		System.out.println("Maximum = " + secondTree.findMaximum().getValue());
		
		//Test 16: find successor
		int value = 50;
		System.out.println("Find successor of value = " + value);
		BSTreeNode next = secondTree.findSuccessor(value);
		System.out.print("The successor of your value = ");
		if(next != null) System.out.println(next.getValue());
		else System.out.println("null");
		
		
		//Test 17: find predecessor
		int value2 = 50;
		System.out.println("Find predecessor of value = " + value2);
		BSTreeNode next2 = secondTree.findPredecessor(value2);
		System.out.print("The predecessor of your value = ");
		if(next2 != null) System.out.println(next2.getValue());
		else System.out.println("null");
		
		//Test 18: sum of elements
		System.out.println("Sum of elements = " + secondTree.sum());
		
		//Test 19: number of elements
		System.out.println("Number of elements = " + secondTree.getNumberOfElements());
	}
		

}
