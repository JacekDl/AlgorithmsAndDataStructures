package datastructures.trees.binarysearchtree;

import testdata.TestDataGenerator;

public class BSTreeTester {

	public static void main(String[] args) {
		
		//Test 1: create BSTree (add one Node)
		BSTree firstTree = new BSTree();
		firstTree.add(3);
		//System.out.println(firstTree.root.getValue());
		
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
		firstTree.add(2);
		//System.out.println(firstTree.root.getRight().getLeft().getRight().getValue());
		
		
		
		//Test 7: add BSTreeNode with value that already exists:
		//firstTree.add(3);
		
		//Test 8: get sum of elements
		//firstTree.sum();
		
		//Test 9: print values stored in BSTree (inorder)
		firstTree.printValuesInorder(firstTree.getRoot());
		System.out.println();
		
		
		//Test 10: print values stored in BSTree (preorder)
		firstTree.printValuesPreorder(firstTree.getRoot());
		System.out.println();
		
		//Test 11: print values stored in BSTree (postorder)
		firstTree.printValuesPostorder(firstTree.getRoot());
		
		//Test 12: find value //TODO: it only finds values doesn't report missing values >> done!!! findValue returns ref to searched value or ref to null if searched value is not in the tree 
		System.out.println();
		BSTreeNode myValue = firstTree.findValue(firstTree.getRoot(), 11);
		if(myValue != null) System.out.println("We have found your value!!!");
		else System.out.println("Your value is not in our tree.");
		
		//TODO: using testdata class create method to add random numbers to a tree (using array)
		//Test 13: 
		BSTree secondTree = new BSTree();
		TestDataGenerator generator = new TestDataGenerator();
		int[] somelist = generator.generateRandomNumbers(50, 100);
		secondTree.addValues(somelist);
		secondTree.printValuesInorder(secondTree.getRoot());
		System.out.println();
		System.out.println(secondTree.getRoot().getValue());
		System.out.print(secondTree.getRoot().getLeft().getValue() + " ");
		System.out.println(secondTree.getRoot().getRight().getValue());
		System.out.println();
		BSTreeNode mySecondValue = secondTree.findValue(secondTree.getRoot(), 11);
		if(mySecondValue != null) System.out.println("We have found your value!!!");
		else System.out.println("Your value is not in our tree.");
		
		
	}

}
