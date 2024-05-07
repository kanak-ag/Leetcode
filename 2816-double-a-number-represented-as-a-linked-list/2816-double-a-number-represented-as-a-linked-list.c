/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

 struct ListNode* reverse(struct ListNode* head) {
    struct ListNode* curr=head;
    struct ListNode* prev=NULL;
    struct ListNode* next=NULL;
    while(curr!=NULL){
        next=curr->next;
        curr->next=prev;
        prev=curr;
        curr=next;
    }
    return prev;
}


struct ListNode* doubleIt(struct ListNode* head){
    head=reverse(head);
    int carry=0;
    struct ListNode* curr=head;
    struct ListNode* prev=NULL;
    while(curr!=NULL){
        int val=curr->val*2+carry;
        carry=val/10;
        curr->val=val%10;
        prev=curr;
        curr=curr->next;
    }
    struct ListNode* temp=malloc(sizeof(struct ListNode));
    if(carry!=0)
    {
     
     temp->val=carry;
        prev->next=temp;
        temp->next=NULL;
        

    }
    return reverse(head);

}