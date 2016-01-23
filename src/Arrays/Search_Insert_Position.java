package Arrays;

/**
 *
 * @author Imran Bijapuri
 */
public class Search_Insert_Position {
    public int[] arr;
    public static void main(String[] args){
        Search_Insert_Position objSearch_Insert_Position = new Search_Insert_Position();
        objSearch_Insert_Position.arr = new int[]{1,3,5,6};
        System.out.println(objSearch_Insert_Position.searchPosition(0, objSearch_Insert_Position.arr.length - 1, 1));
    }
    
    public int searchPosition(int start, int end, int target){
        if(start > end){
            return start;
        }else{
            int mid = start + (end - start) / 2 ;
            if(arr[mid] == target){
                return mid;
            }else{
                if(arr[mid] > target)
                    return searchPosition(start,mid-1,target);
                else
                    return searchPosition(mid+1,end,target);
            }
        }
    }
}

