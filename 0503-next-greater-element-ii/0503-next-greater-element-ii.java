class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int index=0;
        int [] ans= new int [n];
        Stack<Integer> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            stack.push(nums[i]);
        }
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[index++]=-1;
            }
            else{
                ans[index++]=stack.peek();
            }
            stack.push(nums[i]);
        }
        return reverse(ans);
        
    }
    public int [] reverse(int [] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;



    }
}