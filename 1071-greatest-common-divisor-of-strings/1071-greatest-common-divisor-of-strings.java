class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public String gcdOfStrings(String str1, String str2) {
        int n=str1.length();
        int m=str2.length();
        
        if((str1+str2).equals(str2+str1)){
            int r=gcd(n,m);
            if(r==0)
            return str2;
            
            return str2.substring(0, r);
        }
        return "";

        
    }
}
