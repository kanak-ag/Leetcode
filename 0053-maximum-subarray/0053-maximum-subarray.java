
class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int max_let=0;
        for (int i=0;i<nums.length;i++){
            max_let+=nums[i];
            if(max_let>max){
                max=max_let;
            }
            if(max_let<0){
                max_let=0;
            }

        }
        
        return max;
    }
    
}