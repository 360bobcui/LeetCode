/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingbits;

import java.util.Arrays;

/**
 *
 * @author menglu
 */
public class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 0; i < num + 1; i++) {
            ans[i] = getOnes(i);
        }
        return ans;
    }
    
    // return the number of 1s in the binary representation of the given number 
    private int getOnes(int num) {
        double loop = Math.floor(Math.log10(num) / Math.log10(2)); 
        int sum = 0;
        System.out.println(loop);
        for(int i = 0; i <= loop; i++) {
            sum += (num / Math.pow(2, i)) % 2;
        }
        return sum;
    }
}
