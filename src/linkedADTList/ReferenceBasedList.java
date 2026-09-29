package linkedADTList;

public class ReferenceBasedList {
	
	private Node head;
	private int numItems;
	
	// Create empty list
	public ReferenceBasedList() {
		head = null;
		numItems = 0;
	}
	
	// Checks if list is empty
	public boolean isEmpty() {
		return numItems == 0;
	}
	
	// Checks how many items are in list
	public int size() {
		return numItems;
	}
	
	// Finds a specific node in the linked list
	private Node find(int index) {
		Node curr = head;
		
		// Goes through the list, skipping each node
		// until it reaches the specified node
		for(int skip = 1; skip < index; skip++) {
			curr = curr.getNext();
		}
		return curr;
	}
	
	// Gets item from a node
	public Object get(int index) {
		if(index >= 1 && index <= numItems) {
			// Uses the above method to get to
			// the specified node (index)
			Node curr = find(index);
			Object dataItem = curr.getItem();
			return dataItem;
		}
		else {
			return "Was not able to find item :(";
		}
	}
	
	// Adds an item into a node
	public void add(int index, Object item) {
		if(index >= 1 && index <= numItems+1) {
			// As it is the start of the list, it doesn't
			// need to go through the entire list to insert
			// the new node and item
			if(index == 1) {
				Node newNode = new Node(item, head);
				head = newNode;
			}
			// For every node and item after the first one
			else {
				Node prev = find(index-1);
				// Insert new node with item after the node
				// that prev references
				Node newNode = new Node(item, prev.getNext());
				prev.setNext(newNode);
			}
			numItems++;
		}
		else {
			System.out.println("Was not able to add item :(");
		}
	}
	
	// Removes an item from a node
	public void remove(int index) {
		if(index >= 1 && index <= numItems) {
			// Deletes the first node from list
			if(index == 1) {
				head = head.getNext();
			}
			else {
				Node prev = find(index-1);
				// Deletes the node after the node that prev
				// references, then saves reference to node
				Node curr = prev.getNext();
				prev.setNext(curr.getNext());
			}
			numItems--;
		}
		else {
			System.out.println("Was not able to remove item :(");
		}
	}
	
	// Remove all items in list
	public void removeAll() {
		head = null;
		numItems = 0;
	}
	
}
