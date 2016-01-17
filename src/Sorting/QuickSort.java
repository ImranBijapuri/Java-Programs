package Sorting;
/**
 *
 * @author Imran Bijapuri
 */
public class QuickSort {
    public int[] arr;
    public int[] helper;
    
    public static void main(String[] args){
        new QuickSort().init(new int[]{11,232,5,8,7,9,4});
    }
    public void init(int[] arr){
        this.arr = arr;
        sort(0,arr.length-1);
        for(int i : this.arr)
            System.out.println(i);
    }
    
    public void sort(int start, int end){
        int pivot = start + (end-start)/2;
        int i = start;
        int j = end;
        while(i < j){
            while(arr[i] < arr[pivot]){
                i++;
            }
            while(arr[j] > arr[pivot]){
                j--;
            }
            
            if(i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;j--;
            }
        }
        
        if(i < end)
            sort(i,end);
        if(j > start)
            sort(start,j);
        
    }
    
}
