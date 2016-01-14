package Dictionary;

/**
 *
 * @author Imran Bijapuri
 */
public class Node {
    public char value;
    public Node[] arr;
    boolean finish;
    long number;
    
    public Node(char value){
        this.value = value;
        this.arr = new Node[26];
    }
    
    public void setNumber(long number){
        this.number = number;
        this.finish = true;
    }
}
