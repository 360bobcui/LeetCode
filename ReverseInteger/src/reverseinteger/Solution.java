/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseinteger;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author menglu
 */
public class Solution {
        public int reverse(int x) {
        if (x == 0) return 0;
        Queue<Integer> queue = new LinkedList();
        boolean isPos = true;
        if (x < 0) {
            isPos = false;
            x = -1 * x;
        }
        
        while (x > 0) {
            int remainder = x % 10;
            x = x / 10;
            queue.add(remainder);
        }
        //int size = stack.size();
        int result = 0;
        while (queue.size() > 0) {
            double mult = Math.pow(10, (queue.size() - 1));
            result += mult * queue.remove();        
        }
        if (result == Integer.MAX_VALUE) return 0;
        return isPos ? result : -1 * result; 
    }   
}
