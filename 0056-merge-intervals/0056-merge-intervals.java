class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List <int[]> ans=new ArrayList<int[]>();
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=e ){
                if(intervals[i][1]<=e){
                    continue;
                }
                e=intervals[i][1];
            }
            else{
                ans.add(new int[]{s, e});
                System.out.println(s);
        System.out.println(e);
                s=intervals[i][0];
                e=intervals[i][1];
            } 
        }
        ans.add(new int[]{s, e});
        int[][] res=new int[ans.size()][];
        int i=0;
        for (int [] num:ans){
        res[i]=num;
        i++;}
        return (res);
        
    }
}