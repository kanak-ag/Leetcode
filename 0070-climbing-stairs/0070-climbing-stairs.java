class Solution {
    public int climbStairs(int n) {
        int a=1,b=2,c=a+b;
        if(n==1|| n==2 )
        return n;
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            // System.out.println(a );
            // System.out.println(b );
            // System.out.println(c );
        }
        return c;

    }
}