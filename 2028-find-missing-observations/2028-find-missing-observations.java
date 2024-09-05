class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
       int arr[]=new int[n];
       int size=rolls.length,s=0,sum=0;
       
       //sum of existing array
       for(int i=0;i<size;i++){
         s=s+rolls[i];
       }
       int k=mean*(n+size)-s;
       

        if(n<= k && k<= (6*n))
        {
            k=(6*n)-k;
            int j=0;
            for(int i=0;i<n;i++)
            {
                if(k>=5){
                    arr[j]=1;
                    
                    k-=5;
                }
                else if(k<5 && k>0){
                    arr[j]=6-k;
                    k=-1;
                }
                else{
                    arr[j]=6;
                }
                j++;
            }
            return arr;

        }
        
        return new int[0];
    }}