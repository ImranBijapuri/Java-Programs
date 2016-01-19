package Tree;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        Binary_Tree_Preorder_Traversal solution = new Binary_Tree_Preorder_Traversal();
        solution.preorder(solution.list, root);
        return solution.list;
    }

    public void preorder(List<Integer> list, TreeNode root) {
        if (root == null) {
        } else {
            list.add(root.val);
            preorder(list, root.left);
            preorder(list, root.right);
        }
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
