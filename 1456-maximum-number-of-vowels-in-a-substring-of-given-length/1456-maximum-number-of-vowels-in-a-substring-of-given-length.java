class Solution {
    public int maxVowels(String s, int k) {
        String vowels="aeiou";
        int v=0;
        int curr=0;
        for(int i=0;i<k;i++)
        {
            if(vowels.contains(s.charAt(i)+""))
            curr++;
        }
        v=curr;

        for(int i=k;i<s.length();i++)
        {
            int let=curr;
            if(vowels.contains(s.charAt(i)+""))
            let++;
            if(vowels.contains(s.charAt(i-k)+""))
            let--;

            curr=let;
            
            if(let>v)
            v=let;


        }
        return v;


        
    }
}