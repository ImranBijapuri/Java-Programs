/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

class Solution {

    public int[] sortPancakes(int[] pancakes) {

        int last = pancakes.length - 1;
        while (last > 0) {
            int max_index = 0;
            for (int i = 0; i <= last; i++) {
                if (pancakes[i] > pancakes[max_index]) {
                    max_index = i;
                }
            }
            //System.out.println("sa" + max_index);
            flip(max_index + 1, pancakes);
            flip(last + 1, pancakes);
            last--;

        }
        return pancakes;
    }

    public int[] flip(int x, int[] pancakes) {
        int start = 0;
        int end = 0;
        if (x == 0) {
            return pancakes;
        } else if (pancakes.length < x) {
            end = pancakes.length - 1;
        } else {
            end = x - 1;
        }

        while (start < end) {
            int temp = pancakes[start];
            pancakes[start] = pancakes[end];
            pancakes[end] = temp;
            start++;
            end--;
        }

        return pancakes;
    }

    public static void main(String[] args) {
        //int[] arr = new Solution().flip(4, new int[]{1,2,3,4});
        int[] arr = new Solution().sortPancakes(new int[]{4, 3, 2, 1,3,4,564});

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
