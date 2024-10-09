class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        int n= nums2.length;
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                hm.put(nums2[i],-1);
            }
            else{
                hm.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
}