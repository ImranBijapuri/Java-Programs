/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Imran Bijapuri
 */
public class Equal_Sum_Partition {
    public static void main(String[] args){
        boolean status = new Equal_Sum_Partition().getSum(new int[]{5,1,5,11});
        System.out.println(status);
    }
    
    public boolean getSum(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum += i;
        
        int left = 0;
        int right = sum;
        
        for(int i = 0; i < arr.length; i++){
            left += arr[i];
            right -= arr[i];
            if(left == right)
                return true;
        }
        
        return false;
    }
}
