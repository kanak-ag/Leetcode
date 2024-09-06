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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new  HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp=new ListNode(0,head);
        // temp.next=head;
        ListNode curr=head;
        while(curr.next!=null){
            while(set.contains(curr.val)){
                curr=curr.next;
                temp.next=curr;
            }
            if(curr.next==null)
            return temp.next;
            if(set.contains(curr.next.val)){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }


        


        return temp.next;






        // ListNode temp=head;
        // ListNode prev=null;
        // for(int i=0;i<nums.length;i++){
        //     while(head.val==nums[i]){
        //         head=head.next; 
        //         }           
        //     temp=head.next;
        //     prev=head;
        //     while(temp!=null){
        //         while(temp.val==nums[i]){
        //             prev.next=temp.next;
        //             temp=prev.next;
        //         }
        //         prev=temp;
        //         if(temp!=null)
        //         temp=temp.next;
        //     }
        // }
        // return head;
    }
}