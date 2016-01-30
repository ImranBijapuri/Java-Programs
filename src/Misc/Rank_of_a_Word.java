package Misc;

import java.util.HashSet;

/**
 *
 * @author Imran Bijapuri
 */
public class Rank_of_a_Word {
    HashSet<String> arr;
    
    public Rank_of_a_Word(){
        arr = new HashSet();
    }
    
    public static void main(String[] args) {
       String s1 = "b";
       String s2 = "abc";
       //System.out.println(s1.compareTo(s2));
       
       new Rank_of_a_Word().getRank(new String[]{"eacfd"});
    }
    
    public void getRank(String[] arr){
        for(int i = 0; i < arr.length; i++){
            Rank_of_a_Word obj = new Rank_of_a_Word();
            obj.recurse("", arr[i], arr[i]);
            System.out.println(obj.arr.size()-1);
        }
    }
    
    
    public void recurse(String pre, String rem, String target){
        if(rem.equals("")){
            System.out.println(pre);
            this.arr.add(pre);
        }else{
            for(int i = 0; i < rem.length(); i++){
                char p = rem.charAt(i);
                String pr = pre + p ;
                if(pr.compareTo(target) <= 0){
                    recurse(pr, rem.substring(0, i) + rem.substring(i+1), target);
                }
            }
        }
    }
    //public void get
}
