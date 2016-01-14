package Dictionary;

/**
 *
 * @author Imran Bijapuri
 */
public class Trie {
    public Node head;
    
    public static void main(String[] args){
        Trie trie = new Trie();
        trie.addEntry("imran", 716364117);
        trie.addEntry("ankit", 716364118);
        trie.addEntry("saurabh", 716364119);
        
        
        Node entry = trie.getEntry("imran");
        if(entry == null){
            System.out.println("Entry not found in records");
        }else{
            System.out.println("Number for entry is " + entry.number);
        }
        
        entry = trie.getEntry("ankit");
        if(entry == null){
            System.out.println("Entry not found in records");
        }else{
            System.out.println("Number for entry is " + entry.number);
        }
        
        entry = trie.getEntry("saurabh");
        if(entry == null){
            System.out.println("Entry not found in records");
        }else{
            System.out.println("Number for entry is " + entry.number);
        }
        
        entry = trie.getEntry("sadsa");
        if(entry == null){
            System.out.println("Entry not found in records");
        }else{
            System.out.println("Number for entry is " + entry.number);
        }
        
    }
    
    public Trie(){
        head = new Node(' ');
    }
    
    public void addEntry(String str, long number){
        Node current = this.head;
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            Node n = current.arr[(int)c - 97];
            if(n == null){
                current.arr[(int)c - 97] = new Node(c);
            }
            current = current.arr[(int)c - 97];
        }
        current.finish = true;
        current.number = number;
    }
    
    public Node getEntry(String str){
        Node current = this.head;
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            Node n = current.arr[(int)c - 97];
            if(n == null){
                return null;
            }else{
                current = n;
            }
        }
        if(current.finish == true)
            return current;
        else
            return null;
    }
}
