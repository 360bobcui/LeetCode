/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapnodesinpairs;

/**
 *
 * @author menglu
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head != null && head.next != null) {
            ListNode cur1 = head;
            ListNode cur2 = cur1.next;
            head = cur2;
            
            cur1.next = cur2.next;
            cur2.next = cur1;
            
           // cur1 = cur1.next;
            cur2 = cur2.next;  // cur1, cur2 point to same node
            
            while (cur1.next != null && cur1.next.next != null) {
                cur2 = cur2.next;
                ListNode temp = cur2.next;
                cur1.next = temp;
                cur2.next = temp.next;
                temp.next = cur2;
                cur1 = cur2; 
            }           
        } 
        return head;
    }    
}
