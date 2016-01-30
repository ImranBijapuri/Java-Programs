/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Imran Bijapuri
 */
public class LastPosition {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int index = getLastPosition(new int[]{1}, 0, 0, 3);
        System.out.println(index);
    }

    public static int getLastPosition(int[] arr, int start, int end, int target) {
        if (end - start == 1 || end == start) {

            if (arr[end] == target) {
                return end;
            } else if (arr[start] == target) {
                return start;
            } else {
                return -1;
            }
        } else {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                return getLastPosition(arr, start, mid - 1, target);
            } else {
                return getLastPosition(arr, mid, end, target);
            }
        }
    }
}
