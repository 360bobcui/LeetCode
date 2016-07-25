package besttimetobuyandsellstock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author menglu
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;      
        int maxProfit = 0, minPrice = prices[0];

        for(int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);       
            } else {
                 minPrice = Math.min(minPrice, prices[i]);
            }
        }
       return maxProfit;
    } 
}
//    public int maxProfit(int[] prices) {
//        int max = 0;
//        for (int j = 0; j < prices.length; j++) {
//            for (int i = j + 1; i < prices.length; i++) {
//                if (prices[j] < prices[i] && (prices[i] - prices[j]) > max){
//                     max = prices[i] - prices[j];
//                }
//            }
//        }
//        return max;
//    }    
//}
