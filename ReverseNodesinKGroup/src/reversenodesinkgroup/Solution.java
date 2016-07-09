/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 

 
 */
package reversenodesinkgroup;

/**
 *
 * Node last is the last swapped node.
 * Node start is last.next
 * Node end is the last node needs to be swapped,   There are K nodes between Node start and Node end (both inclusive)
 * Node next is end.next;
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        int len = 0;
        if (k == 1 || k ==0 ) {
            return head;
        }
                
        while (cur != null) {
            cur = cur.next;
            len++;
        }
        if (len < k) {
            return head;
        }
        cur = head;        
//        // locate the starting node that doesn't reverse
//        for (int i = 0; i < k ; i++){ 
//            cur = cur.next;
//        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int loop = len / k * k; 
        cur = dummy;
        for (int i = 0; i < loop; i++){
            if (i % k == 0) { 
                dummy = reverseKGroupHelper(dummy, cur, k);
            }
            cur = cur.next;
        }
        return dummy.next;
    }
    
    private ListNode reverseKGroupHelper(ListNode dummy, ListNode last, int k){
        ListNode start = last.next;
        ListNode end = start;
        ListNode next = null;
        for (int i = 0; i < k - 1; i++) {
            end = end.next;
        }
        next = end.next;
        dummy = reverseKGroupHelper(dummy, last, next, start, end);
        return dummy;
    }
    
  /*  
 * Node last is the last swapped node.
 * Node start is last.next
 * Node end is the last node needs to be swapped,   There are K nodes between Node start and Node end (both inclusive)
 * Node next is end.next;
   */ 
    private ListNode reverseKGroupHelper(ListNode dummy, ListNode last, ListNode next, ListNode start, ListNode end) {
        if (start != null || end != null){
            if (end != null && end == start) {
                last.next = start;
                start.next = next;
                return dummy;   
            } else {
                last.next = start.next;
                end.next = start;
                start.next = next;
                start = last.next;
                next = end.next;
                dummy = reverseKGroupHelper(dummy, last, next, start, end);
            }
        }
        return dummy;
    }
}
