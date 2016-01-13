package Collections;

public class Utility_Binary_Search_Tree {
    public static void inOrder_Traversal(Node root){
        if(root == null){
        }else{
            inOrder_Traversal(root.left);
            System.out.print(root.value + "  ");
            inOrder_Traversal(root.right);
        }
    }
    
    
    public static void preOrder_Traversal(Node root){
        if(root == null){
        }else{
            System.out.print(root.value + "  ");
            preOrder_Traversal(root.left);
            preOrder_Traversal(root.right);
        }
    }
    
    
    public static void postOrder_Traversal(Node root){
        if(root == null){
        }else{
            postOrder_Traversal(root.left);
            postOrder_Traversal(root.right);
            System.out.print(root.value + "  ");
        }
    }
    
}
