class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        int n=s.length();
        int right=n-1;
        int r=n-1;
        while(r>=0){
            if(s.charAt(r)=='0'){
                r--;
            }
            else{
                ans+=right-r;
                right--;
                r--;
                
            }
        }
        return ans;

        
    }
}