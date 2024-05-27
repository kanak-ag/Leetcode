class Solution {
    public int missingNumber(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            j=j^i^nums[i];
        }
        return j^(nums.length);
        
        
    }
}