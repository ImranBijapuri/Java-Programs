package Tree;

import Collections.BSTCreator;
import Collections.Node;
import java.util.Stack;

/**
 *
 * @author Imran Bijapuri
 */
public class Iterative_Inorder {
    public static void main(String[] args){
        new Iterative_Inorder().Iterative_inorder_traversal();
    }
    
    
    public void Iterative_inorder_traversal(){
        BSTCreator bst = new BSTCreator(new int[]{1,2,3,4,5,6,7,8,9});
        Node root = bst.createBST(0, bst.arr.length-1);
        Stack<Node> stack = new Stack<Node>();
        stack.push(new Node(10));
        Node current = root;
        while(stack.size() >= 1){
            if(current == null){
                Node n = stack.pop();
                System.out.print(n.value + " ");
                current = n.right;
                if(current != null){
                    stack.push(current);
                    current = current.left;
                }
            }else{
                stack.push(current);
                current = current.left;
            }
        }
    }
}
