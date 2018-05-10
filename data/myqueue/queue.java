package myqueue;

public class queue<T> {
	private int size;
	private T[] arr;
	private int front;
	private int end;
	
	public queue(){
		this.size = 0;
		this.front = 0;
		this.end = -1;
	}
	
	public void add(T value) {
		this.arr[++end] = value;
		this.size++;
	}
	
	public T remove() {
		if(arr==null && arr.length==0)	return null;
		size--;
		return arr[front--];
	}
	
	public T getTop() {
		if(arr==null && arr.length==0)	return null;
		return arr[front];
	}
}
