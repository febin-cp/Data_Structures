package stringRev;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hola = "Hello";
		char[] theCharString = hola.toCharArray();
		Stack theStringStack = new Stack(hola.length());
		for (int i = 0; i < hola.length(); i++) {
			theStringStack.push(theCharString[i]);
		}
		String result = "";
		for (int i = 0; i < hola.length(); i++) {
			char ch = theStringStack.pop();
			result = result + ch;
		}
		
		System.out.println(result);
	}

}
