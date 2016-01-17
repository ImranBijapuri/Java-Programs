package Misc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Imran Bijapuri
 */
public class CoinChange {
    public static void main(String[] args){
        int coinChange = new CoinChange().coinChange(new int[]{1,2,4}, 10);
        System.out.println(coinChange);
    }
    public int coinChange(int[] coins, int amount) {
        Queue<Node> list = new LinkedList<Node>();
        list.add(new Node(amount,0));
        if(amount == 0)
            return 0;
        Node n = null;
        
        while(list.size() > 0){
            System.out.println(list.size());
            Queue<Node> temp = new LinkedList<Node>();
            n = list.poll();
            System.out.println(list.size());
            for(int j : coins){
                int val = n.value - j;
                if(val > 0)
                    temp.add(new Node(val,n.count+1));
                else if(val == 0){
                    return n.count + 1;
                }
            }
            list.addAll(temp);
        }
        
        return -1;
    }
    
    class Node{
        int value;
        int count;
        public Node(int value, int count){
            this.value = value;
            this.count = count;
        }
    }
}
