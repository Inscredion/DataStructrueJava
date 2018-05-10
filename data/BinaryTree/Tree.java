package BinaryTree;

public class Tree {
	public Node root;
	
	public Node find(int key) {
		Node current = root;
		if(root.left==null && root.right==null)
			return null;
		while(current.data!=key) {
		if(key > current.data) {
			current = current.right;
		}
		else if(key < current.data){
			current = current.left;
		}
		if(current==null)
			return null;
		}
		return current;
	}
	
	public Node find_recursion(long key,Node node) {
		if(node!=null) {
			if(key == node.data) {
				return node;
			}
			else if(key < node.data) {
				return find_recursion(key, node.left);
			}
			else {
				return find_recursion(key, node.right);
			}
		}
		return node;
	}
	
	public void insert(long key) {
		Node newnode = new Node(key);
		Node current = root;
		Node parent;
		if(root == null) {
			root = newnode;
			return;
		}
		else {
			while(true) {
			parent = current;
			if(current.data>key) {
				current = current.left;
				if(current ==  null) {
					parent.left = newnode;
					return;
				}
			}
			else  {
				current = current.right;
				if(current == null) {
					parent.right = newnode;
					return;
				}
			}}
		}
	}
	
	public void insert_recursion(Tree t, int e){
		        Node temp = new Node(e);
		        Node backUp = t.root;
		        if(t.root == null){
		            t.root = temp;
		        }else{
		            if(e == t.root.data){
		                return;
		            }else if(e<t.root.data){
		                t.root = backUp.left;
		                insert_recursion(t, e);
		                backUp.left = t.root;
		                t.root = backUp;
		                
		            }else{
		                t.root = backUp.right;
		                insert_recursion(t,e);
		                backUp.right = t.root;
		               t.root = backUp;
		           }
		       }
		    }
	
	public void delete(long key) {
		
	}
	
	public void firstOrder(Node node) {
		if(node != null) {
			System.out.println(node.data);
			
			firstOrder(node.left);
			
			firstOrder(node.right);
		}
	}
	
	public void inOreder(Node node) {
		if(node != null) {
			inOreder(node.left);
			
			System.out.println(node.data);
			
			inOreder(node.right);
		}
	}
	
	public void lastOrder(Node node) {
		if(node != null) {
			lastOrder(node.left);
			
			lastOrder(node.right);
			
			System.out.println(node.data);
		}
	}
}
