package Queue;

public class Testmyqueue {
	public static void main(String[] args) {
		MyQueue mq = new MyQueue(4);
		mq.insert(10);
		mq.insert(20);
		mq.insert(30);
		mq.insert(40);
		System.out.println(mq.peek());
		System.out.println(mq.isEmpty());
		System.out.println(mq.isFull());
		mq.remove();
		System.out.println(mq.isFull());
	
	}
}
