package Linklist;

public class Linklist {
	private Node first;
	
	public Linklist() {
		first = null;
	}
	
	public void insertFirst(long value) {
		Node node_beta = new Node(value);
		node_beta.next = first;
		first = node_beta;
	}
	
	public Node deleteFirst() {
		Node temp = first.next;
		first.next = temp.next;
		return temp;
	}
	
	public void display() {
		Node current = first;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
