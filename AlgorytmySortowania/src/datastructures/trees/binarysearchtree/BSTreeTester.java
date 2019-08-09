package trees.binarysearchtree;

public class BSTreeTester {

	public static void main(String[] args) {
		
		//Test 1: create BSTree (add one Node)
		BSTree firstTree = new BSTree();
		firstTree.add(3);
		System.out.println(firstTree.root.getValue());
		
		//Test 2: add 2nd BSTreeNode(2)
		firstTree.add(2);
		System.out.println(firstTree.root.getLeft().getValue());
		
		//Test 3: add 3rd BSTreeNode(7)
		firstTree.add(7);
		System.out.println(firstTree.root.getRight().getValue());
		
		//Test 4: add 4th BSTreeNode(1)
		firstTree.add(1);
		System.out.println(firstTree.root.getLeft().getLeft().getValue());
		
		
		//Test 5: add 5th BSTreeNode(5)
		firstTree.add(5);
		System.out.println(firstTree.root.getRight().getLeft().getValue());
		
		//Test 6: add more BSTreeNodes(8, 9, 4, 6)
		firstTree.add(8);
		firstTree.add(9);
		firstTree.add(4);
		firstTree.add(6);
		System.out.println(firstTree.root.getRight().getLeft().getRight().getValue());
		
		//Test 7: add BSTreeNode with value that already exists:
		firstTree.add(3);
		
		//Test 8: get sum of elements
		firstTree.sum();
	}

}
