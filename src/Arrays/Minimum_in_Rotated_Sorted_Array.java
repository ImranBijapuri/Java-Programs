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
public class Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        int min = new Minimum_in_Rotated_Sorted_Array().getMin(new int[]{2,1},0, 1);
        System.out.println(min);
    }

    public int getMin(int[] arr,int left, int right) {
        if(right - left == 1){
             int min = arr[left] > arr[right] ? arr[right] : arr[left];
             return min;
        }else{
            int center = left + (right - left) / 2;
            if(arr[center] > arr[left] && arr[center] > arr[right] || arr[center] < arr[left] && arr[center] < arr[right]){
                if(Math.abs(arr[center] - arr[left]) > Math.abs(arr[center] - arr[right]))
                   return getMin(arr, left, center);
                else
                   return getMin(arr,center, right);
            }else{
                if(arr[left] < arr[right])
                    return getMin(arr, left, center);
                else
                    return getMin(arr,center, right);
            }
        }
    }
}
