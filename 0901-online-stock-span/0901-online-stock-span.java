class StockSpanner {
    ArrayList<Integer> stock;
    public StockSpanner() {
        stock=new ArrayList<>();
    }
    
    public int next(int price) {
        stock.add(price);
        int ans=0;
        int i=stock.size()-1;
            while(i>=0 && stock.get(i)<=price ){
                ans++;
                i--;
            }
            return ans;
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */