package LinkedListSingly;


public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public void insertNodeFirst(int dataKey) {
		Node newNode = new Node();
		newNode.data = dataKey;
		newNode.next = first;
		first = newNode;
		
	}
	public boolean isEmpty() {
		return(first == null);
	}
	
	public Node deleteNode() {
		Node temp = first;
		first = first.next;
		return temp;
	}
	public void displayList() {
		System.out.println("Singly linked list {first ---> last}");
		Node cuNode = first;
		while(cuNode != null) {
			cuNode.displayNode();
			cuNode=cuNode.next;
		}
		System.out.println();
	}
	public void insertNodeLast(int dataKey) {
		Node cuNode = first;
		while(cuNode.next != null) {
			cuNode = cuNode.next;
		}
		Node newNode = new Node();
		newNode.data = dataKey;
		cuNode.next = newNode;
	}
}
