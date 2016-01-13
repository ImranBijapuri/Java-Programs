package Collections;

public class MergeSort {

    public int[] arr;
    public int[] helper;

    public static void main(String[] args){
        int[] arr = new int[]{423,63,43433,23,3,3254,23,4565,323,465,5};
        new MergeSort().init(arr);
        for(int i : arr)
            System.out.print(i + "  ");
    }
    
    public void init(int[] arr) {
        this.arr = arr;
        this.helper = new int[arr.length];
        sort(0, arr.length - 1);
    }

    public void sort(int low, int high) {
        if (high > low) {
            int mid = low + (high - low) / 2;
            sort(low, mid);
            sort(mid + 1, high);
            sorter(low, mid, high);
        }
    }

    public void sorter(int low, int mid, int high) {
        for (int f = 0; f < arr.length; f++) {
            helper[f] = arr[f];
        }

        int i = low;
        int j = mid+1;
        int k = low;

        while (i <= mid && j <= high) {
            if (helper[i] < helper[j]) {
                arr[k] = helper[i];
                i++;
            } else {
                arr[k] = helper[j];
                j++;
            }
            k++;
        }
        
        while(i <= mid){
            arr[k] = helper[i];
            i++;k++;
        }
    }
}
