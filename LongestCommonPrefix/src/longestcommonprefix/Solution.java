/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonprefix;

/**
 *
 * @author menglu
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return null;
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            str = commonPrefix(str, strs[i]);            
        }
        return str;
    }
    
    // str1 is the common prefix,  str2 is the string
    private String commonPrefix(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                len = i;
                break;
            }
        }
        return str1.substring(0, len);
        
    }
    
}
