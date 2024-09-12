class Solution {
    public int maxProduct(int[] nums) {
        int m=Integer.MIN_VALUE;
        int n=nums.length;
        int start=1;
        int end=1;
        for(int i=0;i<n;i++){
            if(start==0)
               start=1;
            if (end==0)
                end=1;
            start=start*nums[i];
            end=end*nums[n-i-1];
            m=Math.max(m,Math.max(start,end));

        }
        return m;


        
    }
}