/*
 * Name: - Kushal S Shinde
 * Email: - kshinde1@binghamton.edu
 * 
 * Sum of all nodes in a binary tree
 * 
 *                15
 *              /   \
 *            10     20
 *           /  \   /  \
 *          8   12 16  25   
 * 
 * 
 * In the above binary tree sum = 106.
 */

package Tree;

class BTNode{
	int data;
	BTNode left;
	BTNode right;
	
	public BTNode(int data) {
		this.data = data;
		left = right = null;
	}
}


public class SumOfAllNodesInABinaryTree {

	BTNode root;
	
	BTNode insert(BTNode node, int data){
		if(node == null)
			return (new BTNode(data));
		else{
			if(data<node.data)
				node.left = insert(node.left, data);
			else
				node.right = insert(node.right, data);
		}
		return node;
	}
	
	void preorder(BTNode node){
		if(node==null)
			return;
		System.out.print(node.data + " ");
		
		preorder(node.left);
		
		preorder(node.right);
		
	}
	
	int add(BTNode root) {
		if(root == null)
			return 0;
		return (root.data + add(root.left)+ add(root.right));
	}
	
	public static void main(String[] args) {
		SumOfAllNodesInABinaryTree a1 = new SumOfAllNodesInABinaryTree();
		
		a1.root = a1.insert(a1.root, 15);
				  a1.insert(a1.root, 10);
		          a1.insert(a1.root, 20);
		          a1.insert(a1.root, 8);
		          a1.insert(a1.root, 12);
		          a1.insert(a1.root, 16);
		          a1.insert(a1.root, 25);
		
		
		a1.preorder(a1.root);
		
		System.out.println();
		int result = a1.add(a1.root);
		
		System.out.println(result);
	}

}
