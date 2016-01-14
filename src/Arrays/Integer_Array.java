/*
3. Coding: I have an integer array where every number appears
even number of times and only one appears odd times. Find the number. 
 */
package Arrays;
/**
 *
 * @author Imran Bijapuri
 */
public class Integer_Array {
    public static void main(String[] args){
        int[] arr = new int[]{1,3,4,5,3,2,1,4,5,2,2};
        int result = 0;
        for(int i : arr)
            result = result ^ i;
        
        System.out.println(result);
    }
}
