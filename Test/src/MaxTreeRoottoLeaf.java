import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


class BNode {
    int data;
    BNode left, right;
    
    public BNode(int data){
        this.data = data;
    }
}
class Solut{
    
    Map<BNode,List<Integer>> mp = new HashMap<>();
    int maxi=0;
    
    List<Integer> leng(BNode BNode){
       
          List<Integer> l = new ArrayList<>();
          int indl=0;
       //  int indr =0;
        if(BNode == null){
            l.add(0);
            l.add(0);
      //      l.add(0);
      //      l.add(0);
        return l;
        }
      //  System.out.print(BNode.data);
       
        
        List<Integer> ld = leng(BNode.left);
        List<Integer> rd = leng(BNode.right);
         
         //    System.out.print(BNode.data+"  ");
         //    System.out.print(Math.max(ld.get(3),ld.get(2)));
         //    System.out.println();
      /*  if(BNode.left != null)
            indl=1+Math.max(ld.get(2),rd.get(2));
        else*/
        	indl =Math.max(ld.get(1),rd.get(1))+1;
    
       
        
         //    System.out.print(BNode.data+"  ");
         //    System.out.print(Math.max(ld.get(3),ld.get(2)));
         //    System.out.println();
   /*     if(BNode.right != null)
            indr=1+Math.max(ld.get(3),rd.get(3));
        else
        	indr =Math.max(ld.get(3),rd.get(3));*/
    
        int lt=BNode.data;
        if(ld.get(1) > rd.get(1)){
            lt=lt+ld.get(0);
        }
        else if(ld.get(1) < rd.get(1)){
            lt=lt+rd.get(0);
        }
        else
            lt =lt+  Math.max(ld.get(0),rd.get(0));
     //    int lt = BNode.data +Math.max(ld.get(0),ld.get(1));
      /*  int rt=BNode.data;
        if(indl > indr){
            rt=rt+rd.get(0);
        }
        else if(indl < indr){
            rt=rt+rd.get(1);
        }
        else
            rt =rt+  Math.max(rd.get(0),rd.get(1));*/
      //   int rt = BNode.data +Math.max(rd.get(0),rd.get(1));
        l.add(lt);
     //   l.add(rt);
        l.add(indl);
     //   l.add(indr);
   //    System.out.print(l.get(2)+"  ");
   //    System.out.print(l.get(3)+" ");
       System.out.print(l.get(0)+"  ");
       System.out.print(l.get(1)+" ");
       System.out.print(BNode.data);
       System.out.println();
        return l;
    }
    public int sumOfLongRootToLeafPath(BNode root)
    {
        List<Integer> l= leng(root);
       /* if(l.get(2) > l.get(3)){
            return l.get(0);
        }
        else if(l.get(2) < l.get(3)){
            return l.get(1);
        }
        else
        return Math.max(l.get(0),l.get(1));*/
        return l.get(0);
    }
}

public class MaxTreeRoottoLeaf{
    
    
    static BNode buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        BNode root = new BNode(Integer.parseInt(ip[0]));
        // Push the root to the queue
  
        Queue<BNode> queue = new LinkedList<>(); 

queue.add(root);
// Starting from the second element

int i = 1;
while(queue.size()>0 && i < ip.length) {
    
    // Get and remove the front of the queue
    BNode currBNode = queue.peek();
    queue.remove();
        
    // Get the current BNode's value from the string
    String currVal = ip[i];
        
    // If the left child is not null
    if(!currVal.equals("N")) {
            
        // Create the left child for the current BNode
        currBNode.left = new BNode(Integer.parseInt(currVal));
        // Push it to the queue
        queue.add(currBNode.left);
    }
        
    // For the right child
    i++;
    if(i >= ip.length)
        break;
        
    currVal = ip[i];
        
    // If the right child is not null
    if(!currVal.equals("N")) {
            
        // Create the right child for the current BNode
        currBNode.right = new BNode(Integer.parseInt(currVal));
            
        // Push it to the queue
        queue.add(currBNode.right);
    }
    i++;
}

return root;
}
public static void inorder(BNode root){
if(root == null)
    return;

inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
}

public static void main (String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(br.readLine());
while(t-- > 0){
    String s = br.readLine();
	BNode root = buildTree(s);
    Solut obj = new Solut();
    int res = obj.sumOfLongRootToLeafPath(root);
    System.out.println(res);
}
}
}// } Driver Code Ends


