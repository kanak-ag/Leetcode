class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        return x;
        long s=1;
        long e=x/2;
        long ans=0;
        while(s<=e){
            long m=s+(e-s)/2;
            if((m*m)<=x){
                ans=Math.max(ans,m);
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return (int)ans;
        
    }
}