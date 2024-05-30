class Solution {
    public int countTriplets(int[] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
        {
            for(int k=j;k<arr.length;k++)
        {
            int a=0;
            int b=0;
            for(int x=i;x<j;x++)
            {
                a=a^arr[x];
                // b=b^arr[y];
            }
            for(int y=j;y<=k;y++)
            {
                // a=a^arr[x];
                b=b^arr[y];
            }
            if(a==b)
            {
                count++;
            }
        }
        }
        }
        return count;
        
    }
}