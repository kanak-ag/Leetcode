class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int n=nums.length;
        // int ans=-1
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        if(nums[n-1]-nums[0]==0)
        return 0;
        
        for(int i=1;i<n-1;i++)
        {
            if(nums[i-1]==nums[n-1]-nums[i])
            return i;
        }
        if(nums[n-2]==0)
        return n-1;
        return -1;
        
    }
}