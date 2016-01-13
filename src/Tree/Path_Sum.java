/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import Collections.BSTCreator;
import Collections.Node;

/**
 *
 * @author Imran Bijapuri
 */
public class Path_Sum {
    public static void main(String[] args){
        BSTCreator objBSTCreator = new BSTCreator(new int[]{3,2,3244,2,32,4322});
        Node n = objBSTCreator.createBST(0, objBSTCreator.arr.length - 1);
        System.out.println("created");
        Path_Sum objPath_Sum = new Path_Sum();
        System.out.println(objPath_Sum.getSum(n, 0, 8));
    }
    
    
    public boolean getSum(Node n, int currentsum, int target){
        if(n == null){
            if(currentsum == target)
                return true;
            else
                return false;
        }else{
            return getSum(n.left, currentsum + n.value , target) || getSum(n.left, currentsum + n.value , target);
        }
    }
}
