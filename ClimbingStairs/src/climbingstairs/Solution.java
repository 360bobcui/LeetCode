/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climbingstairs;

/**
 *
 * @author menglu
 */
public class Solution {
    public int climbStairs(int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i <= n; i++) {
            ways[i] = ways[i - 1] + ways[i - 2]; 
        }
        return ways[n];
    }    
}
