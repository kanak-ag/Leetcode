class Solution {
    public String compressedString(String word) {
        String ans="";
        int n=word.length();
        int c=0;
        char ch=word.charAt(0);
        for(int i=0;i<n;i++){
            char now=word.charAt(i);
            if(ch==now){
                if(c<9)
                c++;
                else{
                    ans+=(char) (c + '0');
                    ans+=ch;
                    // System.out.println("IN");
                    c=1;
                }
            
            }
            else{
                ans+=(char) (c + '0') ;
                ans+=ch;
                ch=now;
                c=1;
            }
        }
        ans+=(char) (c + '0');
        ans+=ch;
        return ans;
        
    }
}