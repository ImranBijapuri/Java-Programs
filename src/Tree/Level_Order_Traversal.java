package Tree;

import Collections.BSTCreator;
import Collections.Node;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Imran Bijapuri
 */
public class Level_Order_Traversal {
    public static void main(String[] args){
        new Level_Order_Traversal().level_traversal();
    }
    
    public void level_traversal(){
        BSTCreator bst = new BSTCreator(new int[]{1,2,3,4,5,6,7,8,9});
        Node root = bst.createBST(0, bst.arr.length-1);
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node n = q.remove();
                System.out.print(n.value + "  ");
                if(n.left != null)
                    q.add(n.left);
                if(n.right != null)
                    q.add(n.right);        
            }
            System.out.println();
        }
    }
}
