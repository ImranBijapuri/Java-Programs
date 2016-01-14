package Collections;

import java.util.HashMap;

/**
 *
 * @author Imran Bijapuri
 */
public class Custom_HashMap {
    public static void main(String[] args){
        new Custom_HashMap().testMethod();
    }
    
    public void testMethod(){
        HashMap<Product,String> map = new HashMap<Product, String>();
        map.put(new Product(1,"A"), "first");
        map.put(new Product(2,"A"), "second");
        map.put(new Product(3,"A"), "third");
        System.out.println(map.size());
        System.out.println(map.containsKey(new Product(1,"A")));
    }
}
