package Collections;

/**
 *
 * @author Imran Bijapuri
 */
public class Product {
    int id;
    String name;
    
    public Product(int id, String name){
        this.name = name;
        this.id = id;
    }
    
    public boolean equals(Object obj){
        Product p = (Product) obj;
        return this.id == p.id;
    }
    
    public int hashCode(){
        Integer i = new Integer(id);
        System.out.println(i.hashCode());
        return Integer.toString(id).hashCode();
    }
}
