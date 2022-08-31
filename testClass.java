import java.util.ArrayList;

public class testClass {

	public static void main(String[] args) {
		BinarySearchTree mytree = new BinarySearchTree();
		mytree.insert(mytree.getRoot(), 45);
		mytree.insert(mytree.getRoot(), 38);
		mytree.insert(mytree.getRoot(), 68);
		mytree.insert(mytree.getRoot(), 20);
		mytree.insert(mytree.getRoot(), 40);
		mytree.insert(mytree.getRoot(), 93);
		mytree.insert(mytree.getRoot(), 85);
		mytree.insert(mytree.getRoot(), 56);
		System.out.println("In order traversal:");
		mytree.inOrder(mytree.getRoot());
		System.out.println("\nThere are "+mytree.size(mytree.getRoot())+" nodes on the tree.");
		mytree.remove(mytree.getRoot(), 56);
		mytree.remove(mytree.getRoot(), 68);
		mytree.remove(mytree.getRoot(), 38);
		System.out.println("In order traversal after removal:");
		mytree.inOrder(mytree.getRoot());
		System.out.println("\nThere are "+mytree.size(mytree.getRoot())+" nodes on the tree.");
		if(mytree.search(mytree.getRoot(), 20)) System.out.println("Search for 20 on the tree, the answer is true");
		else System.out.println("Search for 20 on the tree, the answer is false");
		
		System.out.println("\nprintAncestors is "+mytree.printAncestors(mytree.getRoot().getLeftChild().getLeftChild(), 45));
		System.out.println("\n isExternal is " +mytree.isExternal(mytree.getRoot().getLeftChild().getLeftChild()));
		System.out.println("\n isInternal is " +mytree.isInternal(mytree.getRoot().getLeftChild().getLeftChild()));
		
		//System.out.println("\n findMin is"+mytree.findMin(mytree.getRoot()));
		//System.out.println("findMax is"+mytree.findMax(mytree.getRoot()));
		//System.out.println("\n rightMin is "+mytree.rightMin(mytree.getRoot()));
		
		//System.out.println("\n min is "+mytree.min(mytree.getRoot()));
		//System.out.println("max is "+mytree.max(mytree.getRoot()));
		
		if(mytree.isIdentical(mytree.getRoot().getLeftChild(), mytree.getRoot().getRightChild())) System.out.println("isIdentical on the tree, the answer is true");
		else System.out.println("isIdentical on the tree, the answer is false");
		
		BinarySearchTree mytree1 = new BinarySearchTree();
		mytree1.insert(mytree1.getRoot(), 20);
		mytree1.insert(mytree1.getRoot(), 18);
		mytree1.insert(mytree1.getRoot(), 25);
		System.out.println("\n max is "+mytree1.max(mytree1.getRoot()));
		BinarySearchTree mytree2 = new BinarySearchTree();
		mytree2.insert(mytree2.getRoot(), 50);
		mytree2.insert(mytree2.getRoot(), 47);
		mytree2.insert(mytree2.getRoot(), 70);
		System.out.println("\n min is "+mytree2.min(mytree2.getRoot()));
		BinarySearchTree mytree3 = new BinarySearchTree();
		mytree3.insert(mytree3.getRoot(), 45);
		System.out.println("\nIn order traversal:");
		mytree3.inOrder(mytree3.getRoot());
		System.out.println("attach result "+ mytree3.attach(mytree3.getRoot(), mytree1.getRoot(), mytree2.getRoot()));
		System.out.println("In order traversal post attach:");
		mytree3.inOrder(mytree3.getRoot());
	}


}
