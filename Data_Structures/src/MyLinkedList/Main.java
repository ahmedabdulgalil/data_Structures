package MyLinkedList;

public class Main {
	
	public static void main(String[] args) {
		// start with the empty list
		MyLinkedList list = new MyLinkedList();
		
		// *******Insertion
		
		// insert the values
		list.insert(list, 1);
		list.insert(list, 3);
		list.insert(list, 6);
		list.insert(list, 7);
		list.insert(list, 10);
		
		// print the Linkedlist
		
		list.printList(list);
		
		// *********** deletion by key **************
		
		// delete node with value 1
		// in this case the key is at the head
//		list.delete(list, 1);
//		// print the linked list
//		list.printList(list);
//		
//		list.delete(list, 3);
//		list.printList(list);
//		
//		list.delete(list, 7);
//		list.printList(list);
//		
//		list.delete(list, 0);
//		list.printList(list);
		
	}

}
