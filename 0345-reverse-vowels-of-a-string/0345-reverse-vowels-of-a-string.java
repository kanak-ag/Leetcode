class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int n=s.length();
        int j=n-1;
        String vowel="aeiouAEIOU";
        String ans="";
        String ans2="";
        while(i<j)
        {
            if(vowel.contains(s.charAt(i)+"") && vowel.contains(s.charAt(j)+"") )
            {
                ans+=s.charAt(j);
                ans2=s.charAt(i)+ans2;
                i++;
                j--;
            }
            else if(vowel.contains(s.charAt(i)+""))
            {
                ans2=s.charAt(j)+ans2;
                j--;

            }
            else{
                ans+=s.charAt(i);
                i++;
            }
        }
        if(i==j)
        ans+=s.charAt(i);
        ans+=ans2;
        return ans;

        
        
    }
}