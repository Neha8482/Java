import java.util.ArrayList;
import java.util.Stack;
class BinaryTreeNode {
    public Integer data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution
{
    public ArrayList<Integer> preOrder(BinaryTreeNode node){
        ArrayList<Integer> li = new ArrayList<>();
        if(node == null)
        	return li;
        li.add(node.data);
     //   if(node.left != null)
        li.addAll(preOrder(node.left));
     //   if(node.right != null)
        li.addAll(preOrder(node.right));
        return li;
    }
    public ArrayList<Integer> treeFromBracket(String str)
    {
    	int c=0;
    	  boolean neg=false;
    	  if(str.charAt(c) == '-') {
        	  neg=true;
        	  c=c+1;
          }
    	  BinaryTreeNode node ;
    	  if(neg) {
        	  int g = Integer.parseInt(Character.toString(str.charAt(c)));
        	  g=-g;
        	  node = new BinaryTreeNode(g);
          }
          else
        node = new BinaryTreeNode(Integer.parseInt(Character.toString(str.charAt(c))));
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(node);
        int i =c+1;
       while(i<str.length()){
    	   neg=false;
    	   System.out.println(str.charAt(i));
          if(str.charAt(i) == '('){
              i=i+1;
            
              if(str.charAt(i) == '-') {
            	  neg=true;
            	  i=i+1;
              }
              BinaryTreeNode n;
              if(neg) {
            	  int g = Integer.parseInt(Character.toString(str.charAt(i)));
            	  g=-g;
            	  n = new BinaryTreeNode(g);
              }
              else
              n= new BinaryTreeNode(Integer.parseInt(Character.toString(str.charAt(i))));
              System.out.println(n.data);
              BinaryTreeNode rt = s.peek();
              System.out.println(rt.data);
              if(rt.left == null) {
              rt.left=n;
              System.out.println(rt.left.data);
              }
              else {
              rt.right=n;
              System.out.println(rt.right.data);
              }
              s.push(n);
              i=i+1;
          }
          else if(str.charAt(i) == ')'){
               BinaryTreeNode lo = s.pop();
               i=i+1;
           }
       }
        ArrayList<Integer> t = preOrder(node);
        return t;
        
    }
	private static BinaryTreeNode BinaryTreeNode(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
}


public class BTreefromString {
 public static void main(String[] args) {
	Solution sl = new Solution();
	ArrayList<Integer> pl =sl.treeFromBracket("-4(-2(3(-1)))(5)");
	for(Integer i: pl) {
		System.out.print(i+"  ");
	}
}
}
