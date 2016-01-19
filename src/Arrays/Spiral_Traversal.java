package Arrays;

public class Spiral_Traversal {
    public static void main(String[] args){
        int[][] arr = new int[5][1];
        arr[0] = new int[]{1,2,3,4,5};
        //arr[1] = new int[]{6,7,8,9,10};
        //arr[2] = new int[]{11,12,13,14,15};
        //arr[3] = new int[]{16,17,18,19,20};
        //arr[4] = new int[]{21,22,23,24,25};
        new Spiral_Traversal().printSpiral(arr);
    }
    public void printSpiral(int arr[][]){
        int rowstart = 0;
        int rowend = 0;
        int colstart = 0;
        int colend = 4;
        while(rowstart <= rowend && colstart <= colend){
            
            
            for(int i = colstart; i <= colend && rowstart <= rowend; i++){
                System.out.println(arr[rowstart][i] + " ");
            }
            rowstart++;
            
            for(int i = rowstart; i <= rowend && colstart <= colend ; i++){
                System.out.println(arr[i][colend]);
            }
            colend--;
            for(int i = colend; i >= colstart && rowstart <= rowend; i--){
                System.out.println(arr[rowend][i]);
            }
            rowend--;
            for(int i = rowend; i >= rowstart && colstart <= colend ; i--){
                System.out.println(arr[i][colstart]);
            }
            colstart++;
        }
    }
}
