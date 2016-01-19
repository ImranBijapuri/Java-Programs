package LinkedList;

/**
 *
 * @author Imran Bijapuri
 */
public class Insertion_Sort_List {
    public static void main(String[] args){
        Node head = new LinkedList().addNode(0, new int[]{}, null);
        //new LinkedList().traverseList(head);
        Node insertionSortList = new Insertion_Sort_List().insertionSortList(head);
        new LinkedList().traverseList(insertionSortList);
    }
    
    public Node insertionSortList(Node head) {
        if(head == null) return head;
        Node current = head;
        Node thatNode = null;
        while(current.next != null){
            Node temp = current;
            Node prev = null;
            Node minprev = null;
            Node min = current;
            
            while(temp != null){
                if(temp.value < min.value){
                    min = temp;
                    minprev = prev;
                }
                prev = temp;
                temp = temp.next;
            }
            
            // No need to do anything move ahead
            if(minprev == null){
                thatNode = current;
                current = current.next;
            }else{
                minprev.next = min.next;
                if(thatNode == null){
                    head = min;
                }else{
                    thatNode.next = min;
                }
                min.next = current;
                thatNode = min;
            }
        }
        return head;
    }
    
    
}
