package Collections;

public class QuickSort {
    int[] arr;
    public static void main(String[] args){
        int [] arr = new int[]{9,53,4,7534,7,32,2,6,54,253,2};
        new QuickSort().sorter(arr);
        for(int i : arr)
            System.out.print(i + "  ");
    }
    
    public void sorter(int[] arr){
        this.arr = arr;
        sort(arr,0,arr.length - 1);
    }
    
    public void sort(int[] arr, int low, int high){
        int pivot = low + (high-low)/2;
        int i = low;
        int j = high;
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
        
        if(i < high){
            sort(arr,i,high);
        }
        
        if(low < j){
            sort(arr,low,j);
        }
    }
}
