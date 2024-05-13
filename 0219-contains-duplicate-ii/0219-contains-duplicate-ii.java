class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> hm=new HashMap <Integer,Integer>();
        for( int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int res=hm.get(nums[i])-i;
                res=Math.abs(res);
                if(res<=k){
                    // System.out.println(hm.get(nums[i])-i);
                    return true;
                }
            }

            hm.put(nums[i],i);
        }
        return false;
        
    }
}