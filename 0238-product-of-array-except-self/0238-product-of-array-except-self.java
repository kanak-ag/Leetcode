class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int c=0;

        for (int i: nums){
            if(i!=0)
            prod*=i;
            else
            c++;
        }
        if(c>1){
            return (new int[nums.length]);
        }
        if(c==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=prod;
                }
                else{
                    
                    nums[i]=0;
                }
            }
        }
        else{
        for (int i=0;i<nums.length;i++){
            nums[i]=prod/nums[i];
        }}
        return nums;
        
    }
}