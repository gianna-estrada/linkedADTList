package linkedADTList;

public class Node {

	private Object item;
	private Node next;
	
	// Constructor 1
	public Node(Object itemNew) {
		item = itemNew;
		next = null;
	}
	
	// Constructor 2
	public Node(Object itemNew, Node nextNode) {
		item = itemNew;
		next = null;
	}
	
	// Setter for item
	public void setItem(Object itemNew) {
		item = itemNew;
	}
	
	// Getter for item
	public Object getItem() {
		return item;
	}
	
	// Setter for node
	public void setNext(Node nextNode) {
		next = nextNode;
	}
	
	// Getter for node
	public Node getNext() {
		return next;
	}
	
}
