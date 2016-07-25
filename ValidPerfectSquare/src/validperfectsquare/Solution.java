/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validperfectsquare;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 1){
            return false;
        }
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
       } 
        return (num == 0);
    }    
}
