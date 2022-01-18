package LCS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Abc {

	private int x;
	private String y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}

	

}
class Ads implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		if(o1.x)
	}
	
}
class Node{
	int data;
	Node left;
	Node right;
	Node(int x){
		this.data = x;
		left = null;
		right = null;
	}
}
static int traverse(Node root) {
	if(root == null)
		return 0;
	int lh = height(root.left);
	int rh = height(root.right);
	int cd = lh + rh +1 ;
	int ldia = traverse(root.left);
	int rdia = traverse(root.right);
	return Math.max(cd,Math.max(ldia, rdia));
	
}
static int height(Node node) {
	if(node == null)
		return 0;
	int l = height(node.left);
	int r = height(node.right);
	return 1+Math.max(l, r);
}
public class Sorty {
public static void main(String[] args) {
	
	
	
}
}
