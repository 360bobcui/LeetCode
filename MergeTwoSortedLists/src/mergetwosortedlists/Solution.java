/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergetwosortedlists;

/**
 *
 * @author menglu
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                l1 = mergeTwoListsHelper(l1, l2);
                return l1;
            } else {
                l2 = mergeTwoListsHelper(l2, l1);
                return l2;
            }         
        } else if (l1 != null) {
            return l1;
        } else {
            return l2;
        }
    } 
    
    // pre: l1 != null ;  l1.val > l2.val
    // post: return l1 and update l2.next;
    private ListNode mergeTwoListsHelper(ListNode l1, ListNode l2) {
        // base case
        if (l2 != null){
            if (l1.next == null) {
                l1.next = l2;
            } else if (l1.next.val <= l2.val) {
                l1.next = mergeTwoListsHelper(l1.next, l2);
            } else {
                ListNode temp = l2.next;
                l2.next = l1.next;
                l1.next = l2;
                l1.next = mergeTwoListsHelper(l1.next, temp);
            } 
        }
        return l1;     
    }
}
