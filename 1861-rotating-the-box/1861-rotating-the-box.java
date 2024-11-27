class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length;
        int n=box[0].length;
        char [][] ans=new char [n][m];
         for(int i=0;i<m;i++){
            int ind=n-1;
        for(int j=n-1;j>=0;j--){
            if(box[i][j] == '#'){
                box[i][j]='.';
                box[i][ind]='#';
                ind--;
            }
            if(box[i][j]=='*'){
                ind=j-1;
            }
            // ans[j][i]=box[i][j];
           
        }}
        for(int i=0;i<m;i++){for(int j=0;j<n;j++){
            ans[j][i]=box[i][j];
        }}
        for(int row=0;row<n;row++){
        int i=0;
        int j=m-1;
        while(i<j){
            char temp=ans[row][i];
            ans[row][i]=ans[row][j];
            ans[row][j]=temp;
            i++;
            j--;
        }
}

        return ans;
        

        
    }
}