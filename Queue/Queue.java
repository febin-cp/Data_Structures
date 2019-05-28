package ds.Queue;



public class Queue {
	private int maxSize;
	private long[] qArray;
	private int first;
	private int last;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.qArray = new long[size];
		first = -1;
		last = 0;
		nItems = 0;
	}
	
	public void insert(long key) {
		if(nItems != maxSize) {
			first=(first +1)%maxSize;
			System.out.println(first);
			qArray[first]=key;
			nItems++;
			System.out.println(nItems);
			
		}
		else {
			System.out.println("Queue Full");
		}
	}
	public void view() {
		System.out.print("[ ");

		for(int i = 0;i <nItems; i++) {
			System.out.print(qArray[(i+last)%maxSize]+ " ");
		}
		System.out.print("]");
	}
	public void delete() {
		last ++;
		nItems--;
		System.out.println(nItems);
		if(last == maxSize) {
			last = 0;
			System.out.println("No Items");
		}
	}
	public void peak() {
		if(last != -1) {
			System.out.println(qArray[last]);
		}
	}
}
