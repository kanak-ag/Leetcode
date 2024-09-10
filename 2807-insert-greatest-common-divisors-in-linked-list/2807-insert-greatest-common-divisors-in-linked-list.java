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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode store=head;
        int a=0;
        int b=0;
        while(temp.next!=null){
            a=temp.val;
            // temp=temp.next;
            b=temp.next.val;
            store=temp.next;

            int x= a<b?a:b;
            for(int i=x;i>0;i--){
                if(a%i==0 && b%i==0){
                    temp.next=new ListNode(i);
                    temp=temp.next;
                    break;
                }
            }
            temp.next=store;
            temp=temp.next;
        
        }
        return head;
        
    }
}