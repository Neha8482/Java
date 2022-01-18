package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Node{
	int x;
	Node next;
	Node(int x){
		this.x = x;
		next = null;
	}
}
public class Testing {
	static void search(Node root) { //1-2-2-5-3 - null
		int flag =0;
		Map<Integer,Integer> mp = new HashMap<>();
		while(root.next != null) {
			if(mp.get(root.x) == null) {
				mp.put(root.x, 1);
			}
			else if(mp.get(root.x) >= 1) {
				flag =1;
				break;
			}
			root=root.next;
		}
		if(flag == 1)
			System.out.print("Loop in list");
		else 
			System.out.println("No loop");
	}
	public static void main(String[] args) {
	    Node r = new Node(1); //1->2->3->1
	    Node t= new Node(2);
	    r.next = t;
	    Node p = new Node(3);
	    t.next = p;
	    p.next = null;
	    search(r);
		
	}
	
}
