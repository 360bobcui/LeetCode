/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutationsequence;

/**
 *
 * @author menglu
 */
public class Solution {
    public String getPermutation(int n, int k) {
        int[] permutation = new int[n];  //store 1! to n!
        permutation[0] = 1;  // 1!
        //permutation[1] = 1;
        for (int i = 1; i < n; i++) {
            permutation[i] = i *   permutation[i - 1];
        }
        
        
    }    
}
