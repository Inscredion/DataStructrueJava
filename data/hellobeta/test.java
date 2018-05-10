package hellobeta;


public class test {
	public static void main(String[] args) {
		MyStack ms = new MyStack(4);
		ms.push(10);
		ms.push(20);
		System.out.println(ms.peek());
		System.out.println(ms.isEmpty());
		System.out.println(ms.isFull());
		ms.push(30);
		ms.push(40);
		System.out.println(ms.peek());
		System.out.println(ms.isFull());
		ms.pop();
		System.out.println(ms.peek());
		//ms.clear();
		System.out.println(ms.isEmpty());
	}
}
