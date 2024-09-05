class Solution {
    public List<String> summaryRanges(int[] nums) {
      List<String> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            String s="";
            s+=nums[i];
            if(i==nums.length-1)
            {
               ans.add(nums[i]+"");
               return ans; 
            }
            if(nums[i+1]==nums[i]+1)
            {
                s+= "->";
                while(i<nums.length-1 && nums[i+1]==nums[i]+1)
                {
                    i+=1;
                }
                s+=nums[i];
            }
            ans.add(s);
            i+=1;
        }
        return ans;
        
    }
}