class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack=new Stack<>();
        int n=heights.length;
        int [] ans= new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()[0]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=n;
            }
            else{
                ans[i]=stack.peek()[1];
            }
            stack.push(new int [] {heights[i],i});
        }
        // for (int a:ans)
        // System.out.println(a);
        // return 0;
        stack.clear();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()[0]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]+=0;
            }
            else{
                ans[i]-=stack.peek()[1]+1;
            }
            stack.push(new int [] {heights[i],i});
        }
        int m=0;
        for(int i=0;i<n;i++){
            m=Math.max(ans[i]*heights[i],m);
        }
        return m;
        // for (int a:ans)
        // System.out.println(a);
        // return 0;
    }
}