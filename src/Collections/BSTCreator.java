package Collections;
/**
 *
 * @author Imran Bijapuri
 */
// Pass sorted array and it will create a BST else BT
public class BSTCreator {
    public int[] arr;
    
    public static void main(String[] args){
        BSTCreator objBSTCreator = new BSTCreator();
        objBSTCreator.arr = new int[]{12,322,23,4,55,312,7,8,9};
        Node n = objBSTCreator.createBST(0,objBSTCreator.arr.length -1);
        Utility_Binary_Search_Tree.inOrder_Traversal(n);
        System.out.println();
        Utility_Binary_Search_Tree.preOrder_Traversal(n);
        System.out.println();
        Utility_Binary_Search_Tree.postOrder_Traversal(n);
    }
    
    public Node createBST(int start, int end){
        if(start > end){
            return null;
        }else{
            int mid = start+(end-start)/2;
            Node n = new Node(arr[mid]);
            n.left = createBST(start,mid-1);
            n.right = createBST(mid+1,end);
            return n;
        }
    }
}
