public class Node {
	private Integer element;
	private Node parent;
	private Node leftChild;
	private Node rightChild;
	
	public Node(Integer element) {
		this.element=element;
		this.parent=null;
		this.leftChild=null;
		this.rightChild=null;
	}
	
	public Node(Integer element, Node parent, Node leftChild, Node rightChild) {
		this.element=element;
		this.parent=parent;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
	}

	public Integer getElement() {
		return element;
	}

	public void setElement(Integer element) {
		this.element = element;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public Node getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}

	public Node getRightChild() {
		return rightChild;
	}

	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}

	@Override
	public String toString() {
		return "[e=" + element + ", p=" + parent + ", l=" + leftChild + ", r="+ rightChild + "]";
	}
	
	
}
