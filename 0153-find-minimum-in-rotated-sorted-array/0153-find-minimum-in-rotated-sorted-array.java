class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[0];

        if(nums[0]<nums[n-1])
        return nums[0];

        if(nums[n-1]<nums[n-1])
        return nums[n-1];

        int s=1;
        int e=n-1;
        int mid=0;
        while(s<=e){
            mid=s+(e-s)/2;
            if(nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid]>nums[n-1])
            s=mid+1;
            else
            e=mid-1;

        }
        return nums[mid];


        
    }
}