//In an array containing every element twice except for two elements find those two elements 
//in constant space complexity and in linear time
package bitwise;

/**
 *
 * @author Imran Bijapuri
 */
public class Find_single {
    public static void main(String[] args){
        int[] single = new Find_single().getsingle(new int[]{12,32,2,75,232,43,652,65,2,75,232,43,652,65});
    }
    
    public int[] getsingle(int[] arr){
        int combo_XOR = 0;
        for(int i : arr)
            combo_XOR = combo_XOR ^ i;
        
        int count = 0;
        while(combo_XOR > 0){
            if(combo_XOR % 2 == 1)
                break;
            else
                combo_XOR = combo_XOR >> 1;
            count++;
        }
        
        int end = arr.length - 1;
        for(int k = 0; k < end; k++){
            if((arr[k] >> count) % 2 == 1){
                int temp = arr[end];
                arr[end] = arr[k];
                arr[k] = temp;
                k--;end--;
            }
        }
       
        int result1 = 0;
        for(int i = 0; i <= end; i++){
            result1 = result1 ^ arr[i];
        }
        
        int result2 = 0;
        for(int i = end+1; i < arr.length; i++){
            result2 = result2 ^ arr[i];
        }
        
        System.out.println(result1 + "  " + result2);
        
        return new int[]{result1,result2};
    }
}
