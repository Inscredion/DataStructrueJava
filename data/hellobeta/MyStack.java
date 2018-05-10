package hellobeta;

public class MyStack {
	private long[] array;
	private int top;
	
	public MyStack() {
		array = new long[10];
		top = -1;
	}
	
	public MyStack(int maxsize) {
		array = new long[maxsize];
		top = -1;
	}
	
	public void push(long value) {
		array[++top] = value;
	}
	
	public long pop() {
		return array[top--];
	}
	
	public long peek() {
		return array[top];
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==array.length - 1;
	}
	
	public void clear() {
		while(top!=-1)
			top--;
	}

}
