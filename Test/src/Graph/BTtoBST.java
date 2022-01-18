package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node
	{
	    int data;
	    Node left;
	    Node right;
	    Node(int item){
	        data = item;
	        left = null;
	        right = null;
	    }
	} 
	class BTtoBST
	{
	    // The given root is the root of the Binary Tree
	    // Return the root of the generated BST
	    List<Integer> inl = new ArrayList<>();
	    void inorder(Node n){
	        if(n == null)
	        return;
	        inorder(n.left);
	        inl.add(n.data);
	        inorder(n.right);
	    }
	    Node root1;
	   static int y = 0;
	     void pinorder(Node root1){
	        if(y >= inl.size())
	        return;
	        pinorder(root1.left);
	        root1.data = inl.get(y);
	        y=y+1;
	        pinorder(root1.right);
	    }
	    Node binaryTreeToBST(Node root)
	    {
	       inorder(root);
	       Collections.sort(inl);
	       pinorder(root);
	       return root;
	    }
	    public static void main(String[] args) {
			
		}
	}
	 
