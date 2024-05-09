class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[i]==0)
                n--;
                continue;
            }
            if(arr[i]==1){
                i+=1;
            }
            else{
                if(arr[i+1]!=1){
                    n--;
                    i++;
                }
            }
        }
        if(n<=0){
            return true;
        }
        return false;
    }
}