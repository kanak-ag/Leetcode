class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int i:gifts){
            pq.add(i);
        }
        // System.out.println(pq.peek());
        for(int i=0;i<k;i++){
            pq.add((int)Math.sqrt(pq.peek()));

            pq.poll();
        }
        long ans=0;
        while(pq.size()>0){
            ans+=pq.poll();
        }
        return ans;
        
    }
}