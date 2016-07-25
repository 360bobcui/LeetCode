/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bullsandcows;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author menglu
 */
public class Solution {
    public String getHint(String secret, String guess) {
        List<String> guessRight = new ArrayList<>();
        int bulls = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (i < guess.length()) {
                if (secret.charAt(i) == guess.charAt(i)) {
                    bulls++;
                } else {
                   guessRight.add("" + secret.charAt(i));
                }
            }
        }
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (i < guess.length()) {
                if (secret.charAt(i) != guess.charAt(i) && guessRight.contains("" + guess.charAt(i))) {
                    guessRight.remove("" + guess.charAt(i));
                    cows++;
                } 
            }
        }        
        return bulls + "A" + cows + "B";        
    }    
}
