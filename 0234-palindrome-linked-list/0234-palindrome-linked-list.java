/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null)
        {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
    
        ListNode secondHalf=reverseList(slow);
        ListNode temp = secondHalf;
        ListNode firstHalf = head;
        while(secondHalf!=null){
            if(secondHalf.val!=firstHalf.val)
            {   
                 reverseList(temp);
                return false;
               
            }
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
        }
        reverseList(temp);
        return true ;

    }
    private ListNode reverseList(ListNode Head)
    {
        ListNode prev =null;
        ListNode curr = Head;
        while(curr!=null)
        {
            ListNode newNode=curr.next;
            curr.next=prev;
           prev = curr;
           curr=newNode;
        }
        return prev;
    }
}