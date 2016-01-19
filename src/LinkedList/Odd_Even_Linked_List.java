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
public class Odd_Even_Linked_List {

    public Node oddEvenList(Node head) {
        Node head1 = null;
        Node head2 = null;
        if (head != null && head.next != null) {
            head1 = head;
            head2 = head.next;
        } else {
            return head;
        }

        Node tail = null;
        while (head1 != null) {
            tail = head1;
            Node temp = head1.next;
            if (temp != null) {
                head1.next = temp.next;
                head1 = head1.next;
            } else {
                break;
            }

            if (head1 != null && temp != null) {
                temp.next = head1.next;
            }

        }

        tail.next = head2;
        return head;
    }
}
