/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countprimecount;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class Solution {
    public int countPrimes(int n) {
        if (n >= 2) {
            boolean[] visited = new boolean[n];
            Set<Integer> primes = new HashSet<>();
            for (int i = 2; i < n; i++) {
                if(!visited[i]) {
                    primes.add(i);
                    int startNum = i;
                    int multiplier = 1;
                    int index = startNum * multiplier;
                    while (index < n) {
                        visited[startNum] = true;
                        multiplier++;
                        index = startNum * multiplier;                        
                    }
                } else {
                    visited[i] = true;
                }
                
            }
            return primes.size();
        }
        return 0;
    }   
}
