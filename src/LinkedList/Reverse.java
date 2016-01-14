/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Imran Bijapuri
 */
public class Reverse {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n = list.addNode(0, new int[]{32, 43, 454, 6, 7, 67, 65, 3, 23}, null);
        Node reverseNode = new Reverse().reverselist(n);
        list.traverseList(reverseNode);
    }

    public Node reverselist(Node n) {
        if (n.next == null) {
            return n;
        } else {
            Node p = n.next;
            n.next = null;
            Node head = reverselist(p);
            p.next = n;
            return head;
        }
    }
}
