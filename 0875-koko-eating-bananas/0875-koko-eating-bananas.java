class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        Arrays.sort(piles);
        if(n==h)
        return piles[n-1];

        int sum=0;
        for(int i:piles)
        sum+=i;

        int s=(int)Math.ceil((double)sum/h);
        System.out.println(s);
        int e=piles[n-1];
        int m=s;
        int ans=0;
        while(s<=e){
            m=s+(e-s)/2;
            if(isvalid(piles,h,m)){
                ans=m;
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return ans;

        


        
    }
    public boolean isvalid(int[] arr, int k, int m){
        int val=0;
        for(int i:arr){
            val+=(int)Math.ceil((double)i/m);
            if(val>k){
                return false;
            }
        }
        return true;

    }
}