package ds.Queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(5);
		queue.insert(1);
		queue.insert(21);
		queue.insert(312);
		queue.insert(41221);
		queue.insert(51221);
		queue.view();
		queue.delete();
		queue.view();
		queue.peak();
		queue.insert(61221);
		queue.view();
		queue.insert(61221);
		queue.view();
		queue.delete();
		queue.delete();
		queue.insert(1);
		queue.insert(21);
		queue.insert(312);
		queue.view();
	}

}
