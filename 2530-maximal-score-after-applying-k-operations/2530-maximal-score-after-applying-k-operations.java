class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> ts=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:nums){
            ts.add((long)i);
            // System.out.println(i);
        }
        // System.out.println(ts);
        long score=0;
        for(int i=0;i<k;i++){
            long v=ts.peek();
            // System.out.println(v);
            score+=v;
            ts.poll();
            ts.add((long)(Math.ceil((double)v/3)));
            // System.out.println(ts);
        }
        return score;
    }
}