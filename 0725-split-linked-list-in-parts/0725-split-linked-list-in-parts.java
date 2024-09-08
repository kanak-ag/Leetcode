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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        // return ans;
        ListNode temp=head;
        int c=0;
        while(temp!=null)
        {c++;
        temp=temp.next;
        }
        int x=c%k;
        int y=c/k;
        for(int i=0;i<k;i++){
            ans[i]=head;
            temp=head;
            int count=y;
            if(x>0){
            count++;
            x--;
            }
            for(int a=1;a<count;a++)
            {
             temp=temp.next;   
            }
            if(temp!=null){
            head=temp.next;
            temp.next=null;}
            else
            break;

            

        }
        return ans;
    }
}