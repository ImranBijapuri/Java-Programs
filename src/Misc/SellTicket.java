package Misc;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Imran Bijapuri
 */
public class SellTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int n = Integer.parseInt(arr[0]);
        
        int tickets_to_sell = 0;

        try{
            tickets_to_sell = Integer.parseInt(arr[1]);
        }catch(Exception e){
            
        }
        
        str = scanner.nextLine();
        arr = str.split(" ");

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 > i2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        int[] array = new int[arr.length];
        for (int i = 0; i < array.length; i++) {
            queue.add(Integer.parseInt(arr[i]));
        }
        
        
        int result = 0;
        int count = 0;
        
        while(count < tickets_to_sell){
            int x = queue.poll();
            
            result += x;
            if(x-1 != 0){
                queue.add(x-1);
            }
            
            count++;
        }

        //System.out.println(queue);
        System.out.println(result % (10^9 + 7));
        
    }

    public void getMax() {

    }
}
