package BinaryTree;


public class testtree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(20);
		tree.insert(15);
		tree.insert(3);
		
		//System.out.println(tree.root.data);
		//System.out.println(tree.root.right.data);
		//System.out.println(tree.root.left.data);
		//System.out.println(tree.root.right.left.data);
		//System.out.println(tree.find_recursion(15,tree.root).data);
		
		tree.firstOrder(tree.root);
		System.out.println("\n");
		tree.inOreder(tree.root);
		System.out.println("\n");
		tree.lastOrder(tree.root);
	}
}
