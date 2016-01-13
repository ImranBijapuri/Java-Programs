package LinkedList;
/**
 *
 * @author Imran Bijapuri
 */
public class LinkedList {
    Node head;
    
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        Node n = list.addNode(0, new int[]{32,43,454,6,7,67,65,3,23}, null);
        list.traverseList(n);
    }
    
    public Node addNode(int i, int[] arr, Node prev){
        if(i > arr.length-1){
            return null;
        }else{
            Node n = new Node(arr[i]);
            if(prev != null)
                prev.next = n;
            addNode(i+1, arr, n);
            return n;
        }
    }
    
    public void traverseList(Node n){
        Node current = n;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
