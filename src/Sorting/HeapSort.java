package Sorting;
/**
 *
 * @author Imran Bijapuri
 */
public class HeapSort {
    public int[] arr;
    public int N;
    public void generateHeap(int[] arr){
        this.arr = arr;
        this.N = arr.length - 1;
        for(int i = N/2; i >= 0; i--){
            Maxheap(arr,i);
        }
        
        
        while(N > 0){
            int temp = arr[0];
            arr[0] = arr[N];
            arr[N] = temp;
            N --;
            Maxheap(arr,0);
        }
        
        for(int i : arr)
            System.out.print(i + " ");
    }
    
    public void Maxheap(int[] arr,int i){
            int first = 2*i;
            int second = 2*i + 1;
            int larger = i;
            
            if(first <= N && arr[first] > arr[larger])
                larger = first;
            
            if(second <= N && arr[second] > arr[larger])
                larger = second;
            
            if(i != larger){
                int temp = arr[i];
                arr[i] = arr[larger];
                arr[larger] = temp;
                Maxheap(arr,larger);
            }
    }
    
    public static void main(String[] args){
        new HeapSort().generateHeap(new int[]{1,2,3,4,5,6,7,8,9});
    }
    
    
    
}
