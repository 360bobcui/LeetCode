/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lettercombinationsofaphonenumber;

import java.util.*;

/**
 *
 * @author menglu
 */
public class Solution {
    
    public List<String> letterCombinations(String digits) {
        Map<Character, String[]> dict = new TreeMap<>();
        String[] stringArray2 = {"a","b","c"};
        String[] stringArray3 = {"d","e","f"};
        String[] stringArray4 = {"g","h","i"};
        String[] stringArray5 = {"j","k","l"};
        String[] stringArray6 = {"m","n","o"};
        String[] stringArray7 = {"p","q","r","s"};
        String[] stringArray8 = {"t","u","v"};
        String[] stringArray9 = {"w","x","y","z"};
        dict.put('2',stringArray2);
        dict.put('3',stringArray3);
        dict.put('4',stringArray4);
        dict.put('5',stringArray5);
        dict.put('6',stringArray6);
        dict.put('7',stringArray7);
        dict.put('8',stringArray8);
        dict.put('9',stringArray9);
        
        List<String> ans = new ArrayList<>();
        Queue<String[]> list = new LinkedList<>();
        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            if (dict.containsKey(ch)){
                list.add(dict.get(ch));
            } else {
                return ans;
            }
        }
        
        
        return letterCombinationsHelper(ans, list);
    }
    
    private List<String> letterCombinationsHelper(List<String> ans, Queue<String[]> list){
        if(!list.isEmpty()) {
            String[] letters = list.remove();
            if (ans.isEmpty()) {
                for (String letter : letters) {
                    ans.add(letter);
                }            
            } else {
                List<String> ansTemp = new ArrayList<>();
                for (String letter : letters) {
                    for (String pattern : ans) {
                        ansTemp.add(pattern + letter);
                    }
                }
                ans = ansTemp;
            }
            ans = letterCombinationsHelper(ans, list);
        }
        return ans;
    }
}
