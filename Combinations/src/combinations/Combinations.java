/*
Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
package combinations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Combinations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = 4; int k = 2;
       System.out.println(combine(n, k));
    }
    
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> RES = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(n<=0||k<=0||n<k){
            return RES;
        }
        helper(temp,1,RES,n,k);
        return RES;
    
    }
    
    public static void helper(List<Integer> last, int start, List<List<Integer>> RES,int n,int k){
        int size = last.size();
        int space_left = k - size;
        int num_left = n - start + 1;
        if(space_left>num_left){ //make sure to have enough number left to fill up the rest positions
            return;
        }
        
        for(int i = start;i<=n - space_left + 1;i++){//same reason as above to make the loop end earlier
            List<Integer> temp = new ArrayList<>(last);
            temp.add(i);
            if(temp.size()==k){
                RES.add(temp);
            }
            else{
                helper(temp,i+1,RES,n,k);
            }
        }    
}
    
//    public static List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> element = new ArrayList<>();
//        int startIndex = 0;
//        int currentIndex = 0;
//        combine(n, k, startIndex, currentIndex, element, result);
//        return result;
//    }
//    
//    public static void combine(int n, int k, int startIndex, int currentIndex, List<Integer> element, List<List<Integer>> result){
//        if (k <= 0 || n <= 0 || k > n) {
//            return;
//        }   
//        
//        
//        if (element.size() == k) {
//            List<Integer> elementCopy = new ArrayList<>(element);
//            result.add(element);
//        } else if (element.size() < k && currentIndex < n - 1){  
//            element.add(currentIndex + 1); // 0 to 1 base
//            combine(n, k, startIndex, currentIndex + 1, element, result);
//            
//            element.remove(element.size() - 1);
//            combine(n, k, startIndex, currentIndex + 1, element, result);
//        } else if (currentIndex > n - 1){ // startIndex ++
//            element = new ArrayList<Integer>();
//            
//            //currentIndex = 
//            combine(n, k, startIndex + 1, startIndex + 1, element, result);
//        }
//        
////        if (k > n - startIndex) 
////            return;
////        if (k == 0){
////            result.add(element);
////            return;
////        } else {
////            ArrayList<Integer> exclude = new ArrayList<Integer>(element);
////            combine(n, k, startIndex + 1, exclude, result);   
////            ArrayList<Integer> include = new ArrayList<Integer>(element);
////            include.add(startIndex + 1);
////            combine(n, k - 1, startIndex + 1, include, result);           
////        }        
////        if (element.size() == k || ) {
////            List<Integer> elementCopy = new ArrayList<>(element);
////            result.add(elementCopy);
////            element.remove(element.size() - 1);
////            combine(n, k, startIndex, currentIndex, element, result);
////        } else if (element.size() < k && currentIndex < n) {
////            int value = currentIndex + 1;
////            element.add(value); //0 base to 1 base
////            combine(n, k, startIndex, currentIndex + 1, element, result);
////        } else if (currentIndex == n) {
////            element = new ArrayList<>();
////            startIndex++;
////            currentIndex = startIndex;
////            combine(n, k, startIndex, currentIndex, element, result);
////        }
//        
//        //return result;
//    }

    
}
