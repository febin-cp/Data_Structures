package LinkedListSingly;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertNodeFirst(10);
		myList.displayList();
		myList.insertNodeFirst(20);
		myList.insertNodeFirst(30);
		myList.isEmpty();
//		myList.deleteNode();
		myList.displayList();
		myList.insertNodeLast(40);
		myList.displayList();
		
	}
}
