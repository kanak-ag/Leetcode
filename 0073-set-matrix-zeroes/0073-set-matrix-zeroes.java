class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<int[]> l=new ArrayList<>();
        for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                l.add(new int[]{i,j});

                
            }
        }   
        }
        for(int [] arr:l){
            int i=arr[0];
            int j=arr[1];
            for(int k=0;k<m;k++){
                    matrix[k][j]=0;
                }
                for(int k=0;k<n;k++){
                    matrix[i][k]=0;
                }
        }
    }
}