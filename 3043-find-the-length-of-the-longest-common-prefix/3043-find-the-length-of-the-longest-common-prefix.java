class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
    HashSet<Integer> hs=new HashSet<>();

    // int[] arr={1,12,13,100};
    for(int num:arr1){
        while(num>0){
            hs.add(num);
            num/=10;
        }
    }
    // for(int num:hs){
    //     System.out.println(num);
    // }
    // return 0;
    int ans=0;
    for(int num: arr2){
        while(num>0){
            if(hs.contains(num)){
                int d=String.valueOf(num).length();
                if(d>ans)
                ans=d;
            }
            num/=10;
        }
    }
    return ans;




        
    }
}