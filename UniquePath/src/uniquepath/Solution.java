/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniquepath;

/**
 *
 * @author menglu
 */
public class Solution {
    public int uniquePaths(int m, int n) {
        m--;
        n--;
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        int j = 1;
        int res = 1;
        for (int i = m + 1; i <= m + n; i++, j++) {
            res *= i;
            res /= j;
        }
        return res;
    }
}
