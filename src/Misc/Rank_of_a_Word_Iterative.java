
package Misc;

import java.util.ArrayList;

/**
 *
 * @author Imran Bijapuri
 */
public class Rank_of_a_Word_Iterative {
    public static void main(String[] args) {
       String s1 = "b";
       String s2 = "abc";
       //System.out.println(s1.compareTo(s2));
       
       new Rank_of_a_Word_Iterative().getRank(new String[]{"bacdaskjasdkaskaskdasjdaskbdkasbcasckabscbasbcasbcasbcjasbcsabcbascbasckabsks"});
    }
    
    public void getRank(String[] arr){
        for(int i = 0; i < arr.length; i++){
            Rank_of_a_Word_Iterative obj = new Rank_of_a_Word_Iterative();
            obj.it_recurse(arr[i]);
            //System.out.println(obj.arr.size()-1);
        }
    }
    
    public void it_recurse(String target){
        ArrayList<StringBuffer> arr = new ArrayList<StringBuffer>();
        arr.add(new StringBuffer(target.charAt(0) + ""));
        for(int i = 1; i < target.length(); i++){
            int size = arr.size();
            int count = 0;
            while(count < size){
                StringBuffer s = arr.remove(count);
                //System.out.println(s);
                for(int j = 0; j <= s.length(); j++){
                    StringBuffer buf = new StringBuffer(s);
                    buf.insert(j, target.charAt(i));
                    //String str  = s.substring(0, j) + target.charAt(i) + s.substring(j);
                    if(buf.toString().compareTo(target) <= 0){
                        arr.add(buf);
                    }
                    //System.out.println(buf);
                }
                count++;
            }
        }
        System.out.println(arr);
        System.out.println(arr.size()-1);
    }
}
