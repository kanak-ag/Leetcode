class Solution {
    public int minSwaps(String s) {
         Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(c);
            }
             else if (c == ']') {
                if ( stack.isEmpty() || stack.peek() != '[') {
                    stack.push(c);
                }
                else{
                    stack.pop();
                }
            }
        }

        System.out.print(stack);
        int n=stack.size()/2;
        if(n==0)
        return 0;
        if(n%2!=0)
        return (n/2)+1;
        return (n/2);
    }
}