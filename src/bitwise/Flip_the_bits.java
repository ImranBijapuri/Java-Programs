package bitwise;

/**
 *
 * @author Imran Bijapuri
 */
public class Flip_the_bits {

    public int flip_bits(int[] arr) {
        int left = -1;
        int right = -1;
        int one_count = 0;
        int zero_count = 0;
        int max_dif = 0;
        int max_left = -1;
        int max_right = -1;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero_count += 1;
                if (left == -1 && right == -1) {
                    left = i;
                    right = i;
                }else{
                    right = i;
                }
            } else {
                if(zero_count > 0)
                    one_count += 1;
            }

            if (zero_count - one_count > 0) {
                //proceed
                if(zero_count - one_count > max_dif){
                    max_dif = zero_count - one_count;
                    max_left = left; max_right = right;
                    //System.out.println("i was " + i + "left is " + left + " right is  " + right);
                }
            } else {
                //discard
                one_count = 0;
                zero_count = 0;
                left = -1;
                right = -1;
            }

        }
       
        for(int i = 0; i < arr.length; i++){
            if(i >= max_left && i <= max_right){
                if(arr[i] == 0) 
                    result++;
            } else{
                if(arr[i] == 1)
                    result++;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new Flip_the_bits().flip_bits(new int[]{1,1,1,0,0,1,1,1,0,0,0,0,0});
    }
}
