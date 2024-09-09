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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans=new int[m][n];
        for (int i = 0; i < m; i++) 
            Arrays.fill(ans[i], -1);

        int row=0,col=0;

        while(head!=null){
            while(col<n && ans[row][col]==-1){
                ans[row][col]=head.val;
                col++;
                head=head.next;
                if(head==null)
                return ans;
            }
            row++;
            col--;

            while(row<m && ans[row][col]==-1){
                ans[row][col]=head.val;
                row++;
                head=head.next;
                if(head==null)
                return ans;
            }
            row--;
            col--;

             while(col>=0 && ans[row][col]==-1){
                ans[row][col]=head.val;
                col--;
                head=head.next;
                if(head==null)
                return ans;
            }
            row--;
            col++;

            while(row>0 && ans[row][col]==-1){
                ans[row][col]=head.val;
                row--;
                head=head.next;
                if(head==null)
                return ans;
            }
            row++;
            col++;

        }
        return ans;



























        
        // int x=0,y=0;
        // ListNode temp=head;
        // String dir="forward";
        // while(temp.next!=null)
        // {
        //     ans[x][y]=temp.val;
        //     y++;
        //     temp=temp.next;

        //     if(dir=="forward"){
        //         while(y<n && temp.next!=null && ans[m][n]==-1){
        //             ans[x][y]=temp.val;
        //             y++;
        //         }
        //         dir="downward";
        //         y=y-1;
        //         x++;
        //     }

        //      if(dir=="downward"){
        //         while(x<m && temp.next!=null && ans[m][n]==-1){
        //             ans[x][y]=temp.val;
        //             x++;
        //         }
        //         dir="left";
        //         y=y-1;
        //         x--;
        //     }

        //     if(dir=="left"){
        //         while(y>=0 && temp.next!=null && ans[m][n]==-1){
        //             ans[x][y]=temp.val;
        //             y--;
        //         }
        //         dir="up";
        //         y++;
        //         x--;
        //     }

           

        //      if(dir=="up"){
        //         while(x<=0 && temp.next!=null && ans[m][n]==-1){
        //             ans[x][y]=temp.val;
        //             x--;
        //         }
        //         dir="forward";
        //         y++;
        //         x++;
        //     }






        // }
        // return ans;


        
    }
}