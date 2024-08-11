class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0;
        double curr=0;
        for(int i=0;i<k;i++)
        {
            sum+=nums[i];
        } 
        curr=sum;
        for(int i=k;i<nums.length;i++)
        {
            double let=curr+nums[i]-nums[i-k];
            curr=let;
            if(let>sum)
            {
                sum=let;
            }
        }
        return (sum/k);
    }
}