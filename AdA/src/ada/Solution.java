/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ada;

/**
 *
 * @author menglu
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        
        int len1 = getLength(l1);
        int len2 = getLength(l2);
        
        
        if (len1 > len2) {
            return addTwoLists(l1, l2);
        } else {
            return addTwoLists(l2, l1);
        }
           
    
    }
    
    private int getLength(ListNode root) {
        int len = 0;
        ListNode cur = root;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }
    
    // pre: shortList and longList contain at least one node.  
    //      longList has no less nodes than shortList;
    // post: return the sum of the two lists.
    private ListNode addTwoLists(ListNode longList, ListNode shortList) {
        int carry = 0;
        ListNode shortListCurr = shortList;
        ListNode longListCurr = longList;
        while (shortListCurr.next != null) {
            int sum = longListCurr.val + shortListCurr.val + carry;
            carry = sum / 10;
            sum = sum % 10;
            longListCurr.val = sum;
            longListCurr = longListCurr.next;
            shortListCurr = shortListCurr.next;
        }
        int sum = longListCurr.val + shortListCurr.val + carry;
        carry = sum / 10;
        sum = sum % 10;
        longListCurr.val = sum;
        while (carry == 1) {
            if (longListCurr.next == null) {
                longListCurr.next = new ListNode(1);
                carry = 0;
            } else {
                longListCurr = longListCurr.next;
                sum = longListCurr.val + carry;
                carry = sum / 10;
                sum = sum % 10;
                longListCurr.val = sum;
                
            }
        }
        return longList;   
    }
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    } 
}
