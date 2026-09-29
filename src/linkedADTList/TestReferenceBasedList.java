package linkedADTList;

public class TestReferenceBasedList {
	
	public static void main(String[] args) {
		ReferenceBasedList list = new ReferenceBasedList();
				
		list.add(1, "Hello");
		list.add(2, "Lovely");
		list.add(3, "World");
		list.add(4, "How");
		list.add(5, "Are");
		list.add(6, "You");
		
		list.displayList();
		
	}
}
