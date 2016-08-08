/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromelinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author menglu
 */
public class Solution {
//    public boolean isPalindrome(ListNode head) {
//         //int length = 0;
//         ListNode curr = head;
//         List<Integer> list = new ArrayList<>();
//         while (curr != null) {
//            list.add(curr.val);
//            curr = curr.next;
//         }
//         System.out.println(list.size());
//         System.out.println(list);
//         int len = list.size();
//         for (int i = 0; i < len / 2; i++) {
//             if (!list.get(i).equals(list.get(len - i - 1))) {
//                 System.out.println(list.get(i));
//                 System.out.println(list.get(len - i - 1));
//                 return false;
//             }             
//         }
//         return true;
//    }   
    
   // O(n) time O(1) space 
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        
        ListNode slow = head, fast = head;
        ListNode cur  = head, rev  = null;

        //Finding mid point with fast slow, while also reversing first half
        while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           
           cur.next = rev;
           rev = cur;
           cur = slow;
        } 
        
        // Watch out for odd palindrome
        if(fast!=null) slow = slow.next;
     
        // Check palindrome
        while(rev != null ){
            if(rev.val != slow.val) return false;
            rev  = rev.next;
            slow = slow.next;
        }
        
        return true;
    }
}
