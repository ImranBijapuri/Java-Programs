package Sorting;

/**
 *
 * @author Imran Bijapuri
 */
public class MergeSort {
    public int[] arr;
    public int[] helper;
    
    public static void main(String[] args){
        new MergeSort().init(new int[]{-43,3,32,42,33,4542,4365,67});
    }
    
    public void init(int[] arr){
        this.arr = arr;
        helper = new int[arr.length];
        sorter(0,arr.length - 1);
        for(int i : arr)
            System.out.print(i + " ");
    }
    
    public void sorter(int start, int end){
        if(start < end){
            int mid = start + (end - start) / 2;
            sorter(start,mid);
            sorter(mid + 1, end);
            sort(start, mid, end);
        }
    }
    
    public void sort(int start, int mid, int end){
        for(int x = 0; x < arr.length; x++){
            helper[x] = arr[x];
        }
        
        int i = start;
        int j = mid + 1;
        int k = start;
        
        while(i <= mid && j <= end){
            if(helper[i] < helper[j]){
                arr[k] = helper[i];
                i++;
            }else{
                arr[k] = helper[j];
                j++;
            }
            k++;
        }
        
        while(i <= mid){
            arr[k] = helper[i];
            k++;i++;
        }
    }
    
}
