class Solution {
    public int[] finalPrices(int[] prices) {
    Stack <Integer> stack=new Stack<Integer>();
    int n = prices.length;
    for(int i=n-1;i>=0;i--){
        int ele=prices[i];
        while(stack.size()>0){
            if(stack.peek()<=ele){
                prices[i]=ele-stack.peek();
                break;
            }
            else{
                stack.pop();
            }
        }
        stack.push(ele);
    }
      return prices;  
    }
}