package MyLinkedList;

//a singly Linked List
public class MyLinkedList {
	
	private Node head; // head of the list
	
	
	
	// method to insert a new node 
		
	public  MyLinkedList insert(MyLinkedList list, int data) {
		
		//create a new node with given data
		
		Node newNode = new Node(data);
		//System.out.println("Add New node with value: " + newNode.getData());
		
		
		// if the Linked List is empty, 
		// then make the new node as head
		if(list.head == null) {
			list.head = newNode;
			
		} else {
			// else traverse till the last node
			//  and insert the newNode there
			
			Node last = list.head;
			
			while(last.getNext() != null) {
				last = last.getNext();
				
				
			}
			
			// insert the newNode at last node
			last.setNext(newNode);
			//System.out.println("Next node: "+ last.getData());
		}
		// return the list by head
		return list;
			
		}
	
	// delete a node from linked list
	public MyLinkedList delete(MyLinkedList list,  int key) {
		// store head node
		Node currentNode = list.head;
		Node previous = null;
		// case 1: 
		// if head node itself holds the key to be deleted
		
		if(currentNode != null && currentNode.getData() == key) {
			list.head = currentNode.getNext(); // changed head
			
			// display the message 
			System.out.println("\n" + key + " found and deleted");
			
			// return the updated list
			return list;
			
		}
		
		// case 2:
		// if the key is somewhere other than at head
		// search for the key to be deleted
		// keep track  of previous node
		// as it is needed to change currentNode.next
		while(currentNode != null && currentNode.getData() != key) {
			// if currentNode does not hold key
			// continue to next node
			previous = currentNode;
			currentNode = currentNode.getNext();
		}
		// if the key was present, it should be  at currentNode
		// therefore the currentNode shall not be null
		
		if(currentNode != null) {
			// Since the key is at currentNode
			// Unlink currentNode from Linked List
			previous.setNext(currentNode.getNext());
			
			// display the message
			System.out.println("\n" + key + " found and deleted");
			
		}
		
		// Case 3:
		// the key is not present 
		// if key was not present in linked list
		// currentNode should be null
		if(currentNode == null) {
			// display the message
			System.out.println("\n" +  key + " not found");
		}
		// return the list
		return list;
	}
	
	public  void printList (MyLinkedList list) {
		Node currentNode = list.head;
		
		System.out.println("\n LinkedList: ");
		
		// Traverse through the LinkedList
		
		while(currentNode != null) {
			// print the data at current node
			System.out.print("Data: " + currentNode.getData() + " Points --> ");
			
			currentNode = currentNode.getNext();
			
		}
	}
	
	 

}
