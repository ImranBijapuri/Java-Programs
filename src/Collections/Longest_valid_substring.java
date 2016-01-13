/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Stack;

/**
 *
 * @author Imran Bijapuri
 */
public class Longest_valid_substring {
    public static void main(String []args){
        System.out.println(new Longest_valid_substring().isLongest_valid_substring("()(())"));
    }
    
    public boolean isLongest_valid_substring(String str){
        Stack<String> stack = new Stack<String>();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '(')
                stack.push(str.charAt(i) + "");
            else{
                if(stack.isEmpty())
                    return false;
                else
                    stack.pop();
            }
        }
        return true;
    }
}
