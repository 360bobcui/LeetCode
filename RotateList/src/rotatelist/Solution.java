/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatelist;

/**
 *
 * @author menglu
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            len++;        
        } 
        
        k = k % len;
        if (len == k || k == 0) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        reverse(dummy, 1, len);
        reverse(dummy, 1, k);
        reverse(dummy, k + 1, len);        
        return dummy.next;
    }  
    
    // reverse a part of the given linked list from start node to the end node.
    private void reverse(ListNode dummy, int start, int end) {
        if (start == end) return;
        int i = 0;
        ListNode startNode = null;  // a node before the node needs to be reversed
        ListNode endNode = null;  // last node needs to be reversed
        ListNode curr = dummy;   // head
        
        while (i <= end ) {            
            if (i == start - 1) {
                startNode = curr; 
            }            
            if (i == end) {
                endNode = curr;
            }
            curr = curr.next;
            i++;
        }
        
        //start reversing        
        ListNode curr1 = startNode.next;
        ListNode curr2 = curr1;
        while (curr1 != null && curr1 != endNode) {
            curr2 = curr1.next;
            curr1.next = endNode.next;            
            endNode.next = curr1;
            curr1 = curr2;
        }
        startNode.next = endNode;        
    }
    
    //private void 
    
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
