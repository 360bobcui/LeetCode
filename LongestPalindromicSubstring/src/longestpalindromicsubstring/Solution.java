/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestpalindromicsubstring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author menglu
 */
public class Solution {
    public String longestPalindrome(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        char last = 0;
        char current = 0;
        for (char c : s.toCharArray()) {
            if (current == 0) {
                current = c;
            } else {
               last = current;
               current = c;
               
            }
            stack1.push(c);
            
        }
    }
}
