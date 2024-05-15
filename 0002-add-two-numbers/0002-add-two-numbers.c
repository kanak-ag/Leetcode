/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    int c=0;
    struct ListNode* curr=l1;
    struct ListNode* temp;
    while(curr!=NULL && l2!=NULL){
        int sum=curr->val+l2->val;
        curr->val=((sum+c)%10) ;
        c=floor((sum+c)/10);
        printf("%d\n",c);
        temp=curr;
        curr=curr->next;
        l2=l2->next;
        
        // printf("%d",c);
    }
      printf("%d\n",c);
    // printf("%d",c);
    if(curr==NULL && l2==NULL && c==1){
        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        temp->next=newNode;
        newNode->val=c;
        newNode->next=NULL;
        
        return l1;
    }
    
    while(curr!=NULL){
        int sum=curr->val+c;
        curr->val=((sum)%10);
        c=floor(sum/10);
        temp=curr;
        curr=curr->next;
        
    }
    
    while(l2!=NULL){
        int sum=l2->val+c;
        temp->next=l2;
        l2->val=((sum)%10);
        c=floor(sum/10);
        temp=l2;
        l2=l2->next;
        
        // curr=curr->next;
        
    }
    if(c!=0){
        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        temp->next=newNode;
        newNode->val=c;
        newNode->next=NULL;
    }
    
    return l1;
    
}