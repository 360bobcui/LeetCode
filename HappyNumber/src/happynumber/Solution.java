/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> num = new HashSet<Integer>();
        while (n != 1) {
            n = getSquareOfEachDigit(n);
            //System.out.println(n);
            if (!num.contains(n)) {
                num.add(n);
            } else {  // duplicate endless in a cycle
                return false;
            }
        }
        return true;
    }    
    
    private int getSquareOfEachDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum = sum + remainder * remainder;
            n = n / 10;
        }
        //System.out.println("square" + sum);
        return sum ;
    }
}
