class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i: prices){
            min=Math.min(i,min);
            ans=Math.max(ans,i-min);
        }
        return ans;

        }
}