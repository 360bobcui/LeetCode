/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplystrings;

/**
 *
 * @author menglu
 */
public class Solution {
   public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = product + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        String ans = "";
        for (int num : result) {
            if (!(ans.length() == 0 && num == 0)) 
                ans = ans + num;
        }
        return ans.equals("") ? "0" : ans;
    }
    
}
