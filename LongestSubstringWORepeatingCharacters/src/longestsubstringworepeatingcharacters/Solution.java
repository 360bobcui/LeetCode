/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestsubstringworepeatingcharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256];
        int start = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
        int max = 0;  ////size of longest substring 
        
        for (int i = 0; i < s.length(); i++){
            int character = s.charAt(i);
            if(map[character] != -1) {  // repeating character
                start = Math.max(start, map[character] + 1); // always move to the left               
                //start = map[character] + 1; // char after the repeating char appear previously
                 System.out.println(start);
            }             
            map[character] = i;
            max = Math.max(max, i - start + 1);
        }
   
        return max;
//            if (s.length()==0) return 0;
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int max=0;
//        for (int i=0, j=0; i<s.length(); ++i){
//            if (map.containsKey(s.charAt(i))){
//                j = Math.max(j,map.get(s.charAt(i))+1);
//            }
//            map.put(s.charAt(i),i);
//            max = Math.max(max,i-j+1);
//        }
//        return max;
    }
    

    
}
