package Queue;

public class MyQueue {
	long[] array;
	int elements;
	int front;
	int end;
	
	public MyQueue() {
		array = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	public MyQueue(int maxsize){
		array = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}
	
	public void insert(long value){
		array[++end] = value;
		elements++;
	}
	
	public long remove() {
		elements--;
		return array[front--];
	}
	
	public long peek() {
		return array[front];
	}
	
	public boolean isEmpty() {
		return elements == 0;
	}
	
	public boolean isFull() {
		return array.length == elements;
	}
}
