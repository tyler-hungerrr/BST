import java.util.ArrayList;

public class BinarySearchTree {
	private Node root;
	
	public BinarySearchTree() {
		this.root = null;
	}

	public Node getRoot() {
		return this.root;
	}
			
	public boolean isEmpty() {//check if the tree is empty or not
	//check root	
		
	}	
			
	public int numChildren(Node n) {//return the number of Children node of Node n
	//check leftChild & rightChild
	}
	
	public boolean isInternal(Node n) {//check if Node n is an internal node or not. return true for yes
	//check leftChild & rightChild or the return result of numChildren
	}
	
	public boolean isExternal(Node n) {//check if Node n is an external node or not. return true for yes
	//check leftChild & rightChild or the return result of numChildren or return result of isInternal
	}	
	
	public void inOrder(Node currRoot) {//print out an in-order traversal node sequence		
		//if current node is not null
			//check leftchild not refers to null
				//inOrder leftsubtree
			//print current node
			//check rightchild not refers to null
				//inOrder rightsubtree
	}	
	
	public int size(Node currRoot) {//return the number of nodes on the tree
		//similar like what we did in class
		//initial a count
		//if current node is not null
			//count current node
			//check leftchild not refers to null
				//count leftsubtree size recursively and add the result to current count
			//check rightchild not refers to null
				//count rightsubtree size recursively and add the result to current count
		//return count
	}		
	
	public boolean printAncestors(Node currRoot, int target) {//given a node referred by n, this method is going to print its parent, parent's parent, ....stop when it reaches the root
		//if current node is root, or current node is null, return false
		//if current node holds target value, return true;
		//otherwise, if printAncestors(left subtree) or printAncestors(right subtree) is true, print currRoot --recursive
	}
	
	public boolean search(Node currRoot, int targetItem) {//search for an targetItem on the tree rooted at currRoot
		//base case one: if current node is null, return false result ---can not find target
		//base case two: if current node holds target value, return true
		//otherwise
			//if target value is less than the element hold by current node
				//return the result of recursively search in the leftsubtree
			//else if target value is greater than the element hold by current node
			//return the result of recursively search in the rightsubtree
	}
		
	public Node insert(Node currRoot, int newItem) {//if newItem is not found on the tree, pack newItem as a node and then inserted it into the right place of the binary search tree
		//if current node is empty, pack the newItem into a node and insert the node here, return the reference refers to the newNode
		//otherwise, 
			//if newItem is less than the element hold by current node
				//return the result of recursively insert newItem in the leftsubtree
			//else if newItem is greater than the element hold by current node
				//return the result of recursively insert newItem in the rightsubtree
//Node h = new Node(45);
		//this.root = h;
		Node newNode = new Node(newItem);
		//newNode.setParent(h);
	}
	
	public Node remove(Node currRoot, int targetItem) {//remove targetItem from the tree if found. When delete a node with two children, use findmin strategy as discussed in class.
		//if current node is null, return null --item not found
		//if targetItem is less than the element hold by current node
			//return the result of recursively remove targetItem in the leftsubtree
		//else if targetItem is greater than the element hold by current node
			//return the result of recursively remove targetItem in the rightsubtree
		//else --found item, remove
			//if current node is external, set the parent to itself, leftchild,and rightchild to null, update its parent's reference. return a reference of the removde node or you can change the signature to return the removed element
			//else if current node is internal with one child, handle it accordingly
			//else -- current node is internal with two Children, handle it accordingly
		}
		
	public Node findMin(Node currRoot) {//this method will find and return the node holds the minimum element from a tree rooted at currRoot
		//if current node is null, return null'
		//else if current node has no leftChild, return current node which is the minimum
		//else return the result of recursively findmin in the leftsubtree		
    }
	
	public Node findMax(Node currRoot) {//this method will find and return the node holds the maximum element from a tree rooted at currRoot
		//if current node is null, return null'
			//else if current node has no rightChild, return current node which is the maximum
			//else return the result of recursively findmax in the rightsubtree		
    }
	
	//check if tree referred by this.root is identical to another tree referred by anotherRoot
	public boolean isIdentical(Node myCurrRoot, Node anotherRoot) {
		//if myCurrRoot and anotherRoot are both null, return true --two empty trees are identical
		//if myCurrRoot and anotherRoot hold different element, return false
		//else 
			//result 1 = recursively check isIdentical of the myCurrRoot leftsubtree and anotherRoot leftsubtree
			//result 2 = recursively check isIdentical of the myCurrRoot rightsubtree and anotherRoot rightsubtree
			//return true if result 1 and result 2 are true, false otherwise;	
	}
	
	public void attach(Node n, Node root1, Node root2) {
		//Given Node n and two binary search tree rooted at root1 and root2.If n.element is greater than the maximum element stored at tree root1 and smaller than the minimum element stored at tree root2.
		//attach root1 as n's leftsubtree, root2 as n's rightsubtree, this will be done if n's leftChild and rightChild are null, update other reference variables accordingly
		
	}
	
}
