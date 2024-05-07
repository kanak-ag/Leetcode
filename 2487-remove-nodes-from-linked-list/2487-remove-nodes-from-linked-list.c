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

struct ListNode* removeNodes(struct ListNode* head) {
head=reverse(head);
printf("%d",head->val);
int max=0;
struct ListNode* curr=head;
struct ListNode* point=head;
struct ListNode* prev=head;
while(curr!=NULL){
    if(curr->val>=max){
        max=curr->val;
        point->val=max;
        prev=point;
        point=point->next;
    }
    
    curr=curr->next;
}
prev->next=NULL;
return(reverse(head));

    
}

