/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoftwointegers;

/**
 *
 * @author menglu
 */
public class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {   // carry not zero
            int carry = a & b;
            a = a ^ b;            
            b = (carry << 1);  // carry in each digit
        }
        return a;
    }
}
