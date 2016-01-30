/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Imran Bijapuri
 */
public class Uneaten_Leaves {

    static int countUneatenLeaves(int N, int[] A) {
        Arrays.sort(A);
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i <= N; i++){
            list.add(i);
        }
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j) % A[i] == 0){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list.size());
        return list.size();
    }

    public static void main(String[] args) {
        Uneaten_Leaves.countUneatenLeaves(1000000000, new int[]{2, 4, 5 ,17,19});
    }
}


/*


static int countUneatenLeaves(int N, int[] A) {
        int result = 0;
        Arrays.sort(A);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(A[0]);
        for(int i = A.length -1; i >= 0; i--){
            boolean status = true;
            int j = 0;
            while(j < i){
                if(A[i] % A[j] == 0){
                    status = false;
                    break;
                }
                j++;
            }
            
            if(status)
                arr.add(A[j]);
                
        }
        
        
        int i = 1;
        while(i <= N){
            
            boolean status = true;            
            for(int j = 0; j < A.length; j++){
                if(i < A[j]){
                    
                    break;
                }
                if(i % A[j] == 0){
                    status = false;
                    break;
                }
            }
            if(status)
                result++;
            
            
            i++;
        }
        return result;
    }


*/