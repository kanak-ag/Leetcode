class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> hm=new HashMap<Character,Integer>();
        int m=0;
        int c=0;
        int ind=0;
        for (int i=0;i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),i);
                c++;
            if(c>m){
                m=c;
            }}
            else{
                ind++;
                i=ind;
            hm.clear();
            hm.put(s.charAt(i),i);
                c=1;
            
                
                
            }
        }
        return m;
        
    }
}