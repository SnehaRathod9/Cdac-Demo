package TreeImplementation;

//import java.util.*;

public class TreeImplementation {
	static int count, count1;
	dnode root;

	class dnode {
		int data;
		dnode left, right;

		dnode(int e) {
			data = e;
			left = right = null;
		}
	}

	TreeImplementation() { // constructor
		root = null;
	}

	public void insert(int data) {
		root = insert_rec(root, data);
	}

	public dnode insert_rec(dnode root, int data) {
		if (root == null) {
			root = new dnode(data);
			// countleaf(root);
			return root;
		}
		if (data < root.data) {
			root.left = insert_rec(root.left, data);
		} else if (data > root.data) {
			root.right = insert_rec(root.right, data);
		}
		return root;
	}

	public void inorder() {
		inorder_Rec(root);
	}

	// A function to
	// do inorder traversal of BST
	public void inorder_Rec(dnode root) {
		if (root != null) {
			inorder_Rec(root.left);
			System.out.println(root.data);
			inorder_Rec(root.right);
		}
	}

	public void preorder() {
		preorder_Rec(root);
	}

	// A function to do preorder traversal of BST
	public void preorder_Rec(dnode root) {
		if (root != null) {
			System.out.println(root.data);
			preorder_Rec(root.left);
			preorder_Rec(root.right);
		}
	}

	public void postorder() {
		postorder_Rec(root);
	}

	// A function to do postorder traversal of BST
	public void postorder_Rec(dnode root) {
		if (root != null) {
			postorder_Rec(root.left);
			postorder_Rec(root.right);
			System.out.println(root.data);
		}
	}

	public int count() {
		return count_n(root);
	}

	public int count_n(dnode root) {
		if (root != null) {
			count_n(root.left);
			count1++;
			count_n(root.right);
		}
		return count1;
	}

	public int countleaf() {
		return count_leaf(root);
	}

	public int count_leaf(dnode root) {
		if (root != null) {
			count_leaf(root.left);
			if (root.left == null && root.right == null)
				TreeImplementation.count++;
			count_leaf(root.right);
		}
		return TreeImplementation.count;
	}

	public static void main(String[] args) {
		TreeImplementation bst = new TreeImplementation();

		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);

		System.out.println("The BST Created with inorder:\n");
		bst.inorder();

		System.out.println("The BST Created with preorder:\n");
		bst.preorder();

		System.out.println("The BST Created with postorder:\n");
		bst.postorder();

		System.out.println("number of leaf nodes: \n" + bst.countleaf());

		System.out.println("number of nodes: \n" + bst.count());

//      System.out.println("number of leaf nodes:\n"); 
//      int c = 0;
//      bst.countleaf(c); 

	}

}