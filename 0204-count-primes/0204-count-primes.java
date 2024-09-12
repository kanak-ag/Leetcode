class Solution {
    public int countPrimes(int n) {
        int [] arr= new int[n+1];
        if(n==0 || n==1)
        return 0;
        int c=0;
        Arrays.fill(arr,1);
        for(int i=2;i<n;i++){
            if(arr[i]==1){
                c++;
                for(int j=i+i;j<n;j+=i){
                    arr[j]=0;
                }
            }
        }
        return c;

        
        
    }
}