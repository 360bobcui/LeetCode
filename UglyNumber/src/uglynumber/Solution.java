/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uglynumber;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
    public boolean isUgly(int num) {
        if(num==1) return true;
        if(num==0) return false;
    	while(num%2==0) num=num>>1;
    	while(num%3==0) num=num/3;
    	while(num%5==0) num=num/5;
        return num==1;
    }
//        if (num < 1) {
//            return false;
//        }        
//        if (num == 1) {
//            return true;
//        }
//       // List<Integer> primes = new ArrayList<>();
//        //int sqrtNum  = (int) Math.floor(Math.sqrt(num));
//        int arraySize = num + 1;
//        boolean[] visitedNumbers = new boolean[arraySize]; // an array of visited numbers
//        visitedNumbers[0] = true;
//        visitedNumbers[1] = true;
//        for (int i = 2; i < arraySize; i++) {
//            if (!visitedNumbers[i]) {
//                int prime = i;
//                //System.out.println(i);
//                if (prime != 2 && prime != 3 && prime != 5 && num % prime == 0) {
//                    return false;  // factor of a prime other than 2,3,5
//                }
//                int k = 1;
//                int index = prime;
//                while (index < arraySize) {
//                    visitedNumbers[index] = true; 
//                    k++;
//                    index = prime * k;
//                }
//            }        
//        }
//        return true;
//    }
}
