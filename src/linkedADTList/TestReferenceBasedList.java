package linkedADTList;

public class TestReferenceBasedList {
	
	public static void main(String[] args) {
		ReferenceBasedList list = new ReferenceBasedList();
		
		System.out.println("Is the list empty?: " + list.isEmpty());
		
		list.add(1, "Hello");
		list.add(2, "Lovely");
		list.add(3, "World");
		
		System.out.println("How many in list?: " + list.size());
		
		System.out.println(list.get(1));
		
		list.add(1, "Yellow");
		
		System.out.println(list.get(1));
		
		/*
		 * Gives a NullPointer exception?
		list.remove(1);
		
		System.out.println(list.get(1));
		*/
		
		list.removeAll();
		
		System.out.println("Is the list empty now?: " + list.isEmpty());

	}
}
