class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=100;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0 && n!=0){
                n=0;

            }
            else if(nums[i]%2!=0 && n!=1){
                n=1;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}