class Solution {
    public int getLucky(String s, int k) {
        char[] str=s.toCharArray();
        String x="";
        for(int i=0;i<str.length;i++)
        {
            x+=(int)str[i]-96;
        }
        // System.out.println(x);
        int y=0;
        for(int i=0;i<x.length();i++)
        {
            y+=x.charAt(i)-'0';
            // System.out.println(y);
        }
        //  System.out.println(y);
    
        while(k>1)
        {
            k--;
            int ans=0;
            while(y>0)
            {
                ans+=y%10;
                y=y/10;
            }
            y=ans;
            

        }
        return y; 
    }
}