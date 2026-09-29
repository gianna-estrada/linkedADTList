package linkedADTList;

public class TestReferenceBasedList {
	
	public static void main(String[] args) {
		ReferenceBasedList list = new ReferenceBasedList();
				
		list.add(1, "Bacon");
		list.add(2, "Burn");
		list.add(3, "Planet");
		list.add(4, "Arc");
		list.add(5, "LinkedIn");
		list.add(6, "Twitter");
		list.add(7, "iPad");
		
		System.out.println("Longest String object in list: " + list.listLongest());
		
		//list.displayList();
		
	}
}
