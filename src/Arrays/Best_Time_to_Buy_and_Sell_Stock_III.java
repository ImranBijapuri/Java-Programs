/*
Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete at most two transactions.

Note:
A transaction is a buy & a sell. You may not engage in multiple transactions at the same time 
(ie, you must sell the stock before you buy again).
 */
package Arrays;

/**
 *
 * @author Imran Bijapuri
 */
public class Best_Time_to_Buy_and_Sell_Stock_III {

    public static void main(String[] args) {
        int maxProfit = new Best_Time_to_Buy_and_Sell_Stock_III().getMaxProfit(new int[]{5,6,7,100});
        System.out.println(maxProfit);
    }

    public int getMaxProfit(int[] arr) {
        int profit1 = Integer.MIN_VALUE;
        int profit2 = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int pro = arr[i] - arr[i - 1] ;
            if (pro > 0) {
                if (pro > profit2) {
                    if(pro > profit1){
                        profit2 = profit1;
                        profit1 = pro;
                    }else{
                        profit2 = pro;
                    }
                }
            }
        }

        return profit1 + profit2;
    }
}
