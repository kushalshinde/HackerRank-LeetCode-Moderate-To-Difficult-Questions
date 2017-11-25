/* Name :- Kushal S Shinde
 * Email:- kshinde1@binghamton.edu
 * 
 */

package CrackingTheCodingInterview;


class Node{
	int data;
	Node left, right;
	
	Node(int data){
		this.data = data;
		left=right=null;
		
	}
	
}

public class TreeIsValidBST {

	 static Node root;
		
	 	static int max(Node node) {

	 		if(node==null)
	 			return Integer.MIN_VALUE;
	 		
	 		int result = node.data;
	 		int leftmax = max(node.left);
	 		int rightmax = max(node.right);
	 		
	 		if(leftmax > result)
	 			result = leftmax;
	 		
	 		if(rightmax > result)
	 			result = rightmax;
	 		
	 		return result;
	 	}
	 
	    public static boolean isBST(Node root) {
	    	return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	    }
	    
	    private static boolean isValidBST(Node node, int l, int h) {
	        if(node == null)
	            return true;
	        return node.data > l 
	            && node.data < h
	            && isValidBST(node.left, l, node.data)
	            && isValidBST(node.right, node.data, h);
	   }
	    public static void main(String[] args){
	    	TreeIsValidBST.root = new Node(4);
			TreeIsValidBST.root.left = new Node(2);
			TreeIsValidBST.root.right = new Node(5);
			TreeIsValidBST.root.left.left = new Node(1);
			TreeIsValidBST.root.left.right = new Node(3);
	      
			System.out.println(TreeIsValidBST.isBST(root) ? "Given Tree Is a BST" : "Given Tree Is Not a BST");
	        
	        System.out.println(TreeIsValidBST.max(root));
	        
	    }	
	}

