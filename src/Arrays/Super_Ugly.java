package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Imran Bijapuri
 */
public class Super_Ugly {

    public static void main(String[] args){
        new Super_Ugly().find_super_ugly(0, new int[]{2,7,13,19});
    }
    
    public void find_super_ugly(int n, int[] primes) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < primes.length; i++) {
            list.add(primes[i]);
            int result = primes[i] * primes[i];
            while (i < primes.length-1 && result < primes[i + 1]) {
                list.add(result);
                result = result * primes[i];
            }
        }
        
        for(int i : list)
            System.out.print(i + " ");
    }
}
