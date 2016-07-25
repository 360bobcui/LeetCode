/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waterandjugproblem;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        return z == 0 || (long)x + y >= z && z % gcd(x, y) == 0;
    }
    
    public int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
    
    // return true if greatest common divisor is one
    public boolean isGCDOne(int x, int y) {
        if (x >= 0 && y >= 0) {
            int big;
            int small;
            if (x < y) {
                small = x;
                big = y;
            } else {
                small = y;
                big = x;
            }
            int remainder = small;
            while (remainder != 0) {
                remainder = big % small;
                big = small;
                small = remainder;
            }
            if (big == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
