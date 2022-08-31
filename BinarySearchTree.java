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
		return this.root == null;
	}	
			
	public int numChildren(Node n) {//return the number of Children node of Node n
		int count = 0;
		if(n.getLeftChild() != null)
			count++;
		if(n.getRightChild() != null)
			count++;
		return count;
	}
	
	public boolean isInternal(Node n) {//check if Node n is an internal node or not. return true for yes
		return n.getLeftChild() != null || n.getRightChild() != null;
	}
	
	public boolean isExternal(Node n) {//check if Node n is an external node or not. return true for yes
		return n.getLeftChild() == null && n.getRightChild() == null;
	}	
	
	public void inOrder(Node currRoot) {//print out an in-order traversal node sequence		
		if(currRoot != null) {
			if(currRoot.getLeftChild() != null)
				inOrder(currRoot.getLeftChild());
			System.out.println(currRoot.getElement());
			if(currRoot.getRightChild() != null)
				inOrder(currRoot.getRightChild());
			}
	}	
	
	public int size(Node currRoot) {//return the number of nodes on the tree
		int num = 0;
		if(getRoot() != null) {
			num++;
			if(currRoot.getLeftChild()!=null)
				num += size(currRoot.getLeftChild());
			if(currRoot.getRightChild()!=null)
				num += size(currRoot.getRightChild());
			}
		return num;
	}		
	
	public boolean printAncestors(Node currRoot, int target) {//given a node referred by n, this method is going to print its parent, parent's parent, ....stop when it reaches the root
		//if root, or curRoot is null, return false
		//if currRoot holds target value, return true;
		//otherwise, if printAncestors(left subtree) or printAncestors(right subtree) is true, print currRoot --recursive
		if(root == null||currRoot == null) return false;
		if (currRoot.getElement() == target) return true;
		else{
			if(printAncestors(currRoot.getLeftChild(),target) || printAncestors(currRoot.getRightChild(),target))
			System.out.println(printAncestors(currRoot.getParent(),target));
			return true;
		}
	}
	
	public boolean search(Node currRoot, int targetItem) {//search for an targetItem on the tree rooted at currRoot
		if(currRoot.getElement() == null) return false;
		else if (currRoot.getElement() == targetItem)
			return true;
		if (targetItem < currRoot.getElement()) {
			if(currRoot.getLeftChild() == null) 
				return false;
			else {
			return search(currRoot.getLeftChild(), targetItem);
			}
		}
		else {
			if (currRoot.getRightChild() == null)
				return false;
			else {
			return search(currRoot.getRightChild(), targetItem);
			}
		}
	}
		
	public Node insert(Node currRoot, int newItem) {//if newItem is not found on the tree, pack newItem as a node and then inserted it into the right place of the binary search tree
		if(isEmpty() == true) {
			  this.root = new Node(newItem);
			  return root;
			}
		if (newItem < currRoot.getElement()) {
			if(currRoot.getLeftChild() == null) {
				Node newNode = new Node(newItem);
				newNode.setParent(currRoot);
				currRoot.setLeftChild(newNode);
	            return newNode;
			}
			else {
				return insert(currRoot.getLeftChild(), newItem);
			}
		}
		if (newItem > currRoot.getElement()) {
			if(currRoot.getRightChild() == null) {
				Node newNode = new Node(newItem);
				newNode.setParent(currRoot);
				currRoot.setRightChild(newNode);
	            return newNode;
			}
			else {
				return insert(currRoot.getRightChild(), newItem);
			}
		}
		return null;
	}
	//fix
	public Node remove(Node currRoot, int targetItem) {//remove targetItem from the tree if found. When delete a node with two children, use findmin strategy as discussed in class.
	//if current node is null, return null --item not found
		if (currRoot == null) return null;
		if (targetItem < currRoot.getElement())
			return remove(currRoot.getLeftChild(), targetItem);
		else if (targetItem > currRoot.getElement())
			return remove(currRoot.getRightChild(), targetItem);
		else {
			if (isExternal(currRoot)) {
				if (size(currRoot) == 1 && getRoot().getElement() == targetItem) {
					this.root = null;
					return currRoot;
				}
				if (currRoot.getElement() < currRoot.getParent().getElement()) {
					currRoot.getParent().setLeftChild(null);
					currRoot.setParent(currRoot);
					return currRoot;
				}
				else {
					currRoot.getParent().setRightChild(null);
					currRoot.setParent(currRoot);
					return currRoot;
				}
			}
			if (numChildren(currRoot) == 1) {
				Node fre;
				if (currRoot.getLeftChild() != null) {
					fre = currRoot.getLeftChild();
					return fre;
				}
				else fre = currRoot.getRightChild();
				if (currRoot.getElement() < currRoot.getParent().getElement()) {
					currRoot.getParent().setLeftChild(fre);
					currRoot.setParent(currRoot);
					return fre;
				}
				else {
					currRoot.getParent().setRightChild(fre);
					currRoot.setParent(currRoot);
				}
				return fre;
		}
			else {
				Node delete = rightMin(currRoot.getRightChild());
				currRoot.setElement(delete.getElement());
				return remove(delete,delete.getElement());
		}
		}
    }
		
	public Node findMin(Node currRoot) {//this method will find and return the node holds the minimum element from a tree rooted at currRoot
		if(currRoot == null) return null;
			else if(currRoot.getLeftChild() == null) return currRoot;
			else return findMin(currRoot.getLeftChild());
    }
	
	public Node findMax(Node currRoot) {//this method will find and return the node holds the maximum element from a tree rooted at currRoot
		if(currRoot == null) return null;
		else if(currRoot.getRightChild() == null) return currRoot;
		else return findMax(currRoot.getRightChild());
    }
	
	//check if tree referred by this.root is identical to another tree referred by anotherRoot
		public boolean isIdentical(Node myCurrRoot, Node anotherRoot) {	
			if (myCurrRoot == null && anotherRoot == null) return true;
			if (myCurrRoot.getElement() != anotherRoot.getElement()) return false;
			else {
				boolean result1 = isIdentical(myCurrRoot.getLeftChild(), anotherRoot.getLeftChild());
				boolean result2 = isIdentical(myCurrRoot.getRightChild(), anotherRoot.getRightChild());
				if (result1 && result2) return true;
				else return false;
			}
		}
		
		public int attach(Node n, Node root1, Node root2) {
			if (n.getElement() > max(root1) && n.getElement() < min(root2)) {
				if (n.getLeftChild() == null && n.getRightChild() == null) {
				n.setLeftChild(root1);
				n.setRightChild(root2);
				return 1;
				}
				else return 2;
			}
			else return 3;
		}
	public Node rightMin(Node currRoot) {//this method will find and return the node holds the minimum element from a tree rooted at currRoot
		if(currRoot == null) return null;
			else if(currRoot.getRightChild() == null) return currRoot;
			else return rightMin(currRoot.getRightChild());
    }
	public Integer min(Node currRoot) {
		Integer min = currRoot.getElement();
		if(currRoot.getElement() == null) return 0;
		if (min > currRoot.getLeftChild().getElement()) {
			min = currRoot.getLeftChild().getElement();
		}
		if (min > currRoot.getRightChild().getElement()) {
			min = currRoot.getRightChild().getElement();
		}
		return min;
	}
		
		public Integer max(Node currRoot) {
			Integer max = currRoot.getElement();
			if(currRoot.getElement() == null) return 0;
			if (max < currRoot.getLeftChild().getElement()) {
				max = currRoot.getLeftChild().getElement();
			}
			if (max < currRoot.getRightChild().getElement()) {
				max = currRoot.getRightChild().getElement();
			}
			return max;
		}
}
