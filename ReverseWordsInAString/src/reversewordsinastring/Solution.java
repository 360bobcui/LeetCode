/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversewordsinastring;

/**
 *
 * @author menglu
 */
public class Solution {
    
    // only 55 ms，  can do better
    public String reverseWords(String s) {
        if (s == null) return null;
        s = s.trim();
        String[] strings = s.split("[ ]+");  // == \\s+
        if (strings.length == 1 || strings.length == 0) return s;
        System.out.println(strings.length);
        String result = "";
        for (int i = strings.length - 1; i > 0; i--){
            //if (!strings[i].trim().equals("") || !strings[i].trim().equals(" "));
                result += (strings[i].trim() + " ");
        }
        return result + strings[0];        
    }
}
