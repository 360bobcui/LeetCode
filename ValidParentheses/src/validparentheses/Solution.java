/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validparentheses;

import java.util.Stack;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;
                case ']':
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '[') return false;
                    break;
                case '}':                   
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '{') return false;
                    break;
                case ')':
                    if (stack.isEmpty()) return false;
                    if (stack.pop() != '(') return false;
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
        
    }    
}
