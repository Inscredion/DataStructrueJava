package LinkHash;
import java.io.*;

@SuppressWarnings("unused")

public class Link {
	private int data;
	private Link next;
	
	public Link(int value) {
		this.data = value;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public void displayLink() {
		System.out.println("the link value is"+this.data);
	}
}
