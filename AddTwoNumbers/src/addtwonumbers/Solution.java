/* 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }

FAIL EFFICIENCY TEST.  CAN MODIFY GIVEN ListNodes.
  */
package addtwonumbers;

/**
 *
 * @author menglu
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = null; 
        ListNode cur = null;
        int carry = 0;
            
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            ListNode temp = new ListNode(sum % 10);
            if (ans == null) {
                cur = temp;
                ans = cur;    
            } else {
                cur.next = temp;
                cur = temp;
            }
            l1 = l1.next;
            l2 = l2.next;

        }

        while (l1 != null) {
            int sum = l1.val + carry;
            carry = sum / 10; 
            ListNode temp = new ListNode(sum % 10);
            cur.next = temp;
            cur = cur.next;
        }

        while (l2 != null) {
            int sum = l2.val + carry;
            carry = sum / 10; 
            ListNode temp = new ListNode(sum % 10);
            cur.next = temp;
            cur = cur.next;
        } 

        if (carry != 0) {
            cur.next = new ListNode(carry);
        }
        
        return ans;
    }
}
