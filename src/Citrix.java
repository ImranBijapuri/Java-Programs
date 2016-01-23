
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Imran Bijapuri
 */
public class Citrix {

    public static void main(String[] args) {
        new Citrix().findMin();
    }

    //5 8 
    
    //1 3 6 2 5 rad
    //5 6 8 3 4 cos  
    
    
    //0 5 4 3 5 res
    public void findMin() {
        LinkedList<Gear> list = new LinkedList<Gear>();
        int[] result = new int[5];
        Random random = new Random();
        Gear gear = null;
        int[] rad = new int[]{1,3,6,2,5};
        int[] cos = new int[]{5,6,8,3,4};
        for (int i = 0; i < 5; i++) {
            gear = new Gear(rad[i], cos[i], i);
            list.add(gear);
        }
        Collections.sort(list);

        for (Gear g : list) {
            System.out.println(g.radius + " " + g.cost + " " + g.position);
        }
        
        for(int i = 0; i < list.size(); i++){
            int left = 0;
            int right = list.size()-1;
            Gear g = list.get(i);
            long min_cost = Integer.MAX_VALUE;
            int min_pos = -1;
            while(left <= right){
                if(g.radius + list.get(right).radius >= 8){
                    if(list.get(right).cost < min_cost){
                        min_cost = list.get(right).cost;
                        min_pos = list.get(right).position;
                    }
                }else{
                    break;
                }
                right--;
            }
            
            result[g.position] = min_pos + 1;
        }
        
        
        for(int i : result)
            System.out.print(i+ " ");
    }

    class Gear implements Comparable<Gear> {

        long radius;
        long cost;
        int position;

        public Gear(long radius, long cost, int position) {
            this.radius = radius;
            this.cost = cost;
            this.position = position;
        }

        @Override
        public int compareTo(Gear o) {
            if (o.radius < this.radius) {
                return 1;
            } else {
                return -1;
            }
        }

    }
}
