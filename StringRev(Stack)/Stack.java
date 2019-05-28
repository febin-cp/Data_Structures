package stringRev;



public class Stack {
	private int size;
	private char[] stackArray;
	private int top;
	public Stack(int size) {
		this.size = size;
		this.stackArray = new char[size];
		this.top = -1;
	}
	
	public void push(char a) {
		top=top+1;
		stackArray[top] = a;
	}
	
	public char name() {
		return stackArray[top];
	}
	
	public char pop() {
		if(isEmpty()) {
			
			System.out.println("Nah");
			return 'n';
			
		}
		else {
			int old = top;
			top=top-1;
			return stackArray[old];
		}	
	}
	public boolean isEmpty() {
		return(top ==-1);
	}
	public boolean isFull() {
		return(top == size);
	}

	
	
	
}
