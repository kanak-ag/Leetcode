class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         String[] arr1 = s1.split(" ");
         String[] arr2 = s2.split(" ");
         
         HashMap<String,Integer> mp=new HashMap<>();
         for(String num:arr1){
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }
            else{
                mp.put(num, 1);
            }
         }
         for(String num:arr2){
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }
            else{
                mp.put(num, 1);
            }
         }
         int c=0;
        

         for (String key : mp.keySet()) {
            if(mp.get(key)==1){
             c++;
             }
            //  else{
            //     mp.remove(key);
            //  }
            }
        String[] ans =new String[c];
        int i=0;

         for (String key : mp.keySet()) {
             if(mp.get(key)==1){
           ans[i]=key;
           i++;
        }}
        return ans;


        
        
    }
}