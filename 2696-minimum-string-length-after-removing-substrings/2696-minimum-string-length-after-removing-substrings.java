class Solution {
    public int minLength(String s) {
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(stack.size()!=0){
            if(stack.peek()=='A' && s.charAt(i)=='B'){
                stack.pop();
                continue;
            }
            if(stack.peek()=='C' && s.charAt(i)=='D'){
                stack.pop();
                continue;
            }}
            stack.push(s.charAt(i));

        }
        System.out.println(stack);
        return stack.size();
        
    }
}