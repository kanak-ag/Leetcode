class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boat=0;
        while(i<=j){
            if(people[j]==limit)
            {
                boat++;
                j--;
            }
            else if (people[j]+people[i]>limit){
                boat++;
                j--;
                
            }
            else{
                boat++;
                j--;
                i++;
            }
        }
        return boat;
        
    }
}