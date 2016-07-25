/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofthree;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        return (n > 0 && n % 3 == 0 && isPowerOfThree(n / 3));
    }   
    
//    public boolean isPowerOfThree(int n) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Math.log(Integer.MAX_VALUE) / Math.log(3.0));
//        System.out.println( Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3.0))));
//        return n > 0 && (int) Math.pow(3, (int) (Math.log(Integer.MAX_VALUE) / Math.log(3.0))) % n == 0;
//    } 
}
