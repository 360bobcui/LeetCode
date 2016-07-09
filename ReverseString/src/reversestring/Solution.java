/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author menglu
 */
public class Solution {
    public String reverseString(String s) {
        String result = null;
        if (s != null) {
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length / 2; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[charArray.length - i - 1];
                charArray[charArray.length - i - 1] = temp;
            }
            result = new String(charArray);
        }
        return result;
    }    
}
