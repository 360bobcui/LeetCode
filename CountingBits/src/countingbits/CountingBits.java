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
public class CountingBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 10;
        int[] ans = new Solution().countBits(num);
        System.out.println(Arrays.toString(ans));
    }
    
}
