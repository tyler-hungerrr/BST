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
		mytree.remove(mytree.getRoot(), 56);
		mytree.remove(mytree.getRoot(), 68);
		mytree.remove(mytree.getRoot(), 45);
		System.out.println("In order traversal after removal:");
		mytree.inOrder(mytree.getRoot());
		System.out.println("\nThere are "+mytree.size(mytree.getRoot())+" nodes on the tree.");
		if(mytree.search(mytree.getRoot(), 20)) System.out.println("Search for 20 on the tree, the answer is true");
		else System.out.println("Search for 20 on the tree, the answer is false");
		
		System.out.println("Node stores maximum is "+mytree.findMax(mytree.getRoot()));
		
		BinarySearchTree mytesttree = mytree;
		System.out.println("Two tree identical? "+mytree.isIdentical(mytree.getRoot(), mytesttree.getRoot()));
		mytesttree = new BinarySearchTree();
		mytesttree.insert(mytesttree.getRoot(), 45);
		System.out.println("After change, two tree identical? "+mytree.isIdentical(mytree.getRoot(), mytesttree.getRoot()));
	}


}
