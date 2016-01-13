package Collections;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Merge_K_Sorted_Arrays_in_Java {

    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(211);
        q.add(2);
        q.add(25);
        q.add(21541);
        q.add(23411);
        System.out.println(q.poll());
        System.out.println(q.poll());
    }

    public void sortmergerlist(Queue<Node> queue) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        while (!queue.isEmpty()) {
            Node n = queue.poll();
            q.add(n.value);
        }
    } 
        class Node {

            int value;
        }

    }
