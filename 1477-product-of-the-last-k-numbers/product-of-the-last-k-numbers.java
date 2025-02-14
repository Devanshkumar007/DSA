class ProductOfNumbers {
ArrayList<Integer> ans;
    public ProductOfNumbers() {
        ans =new ArrayList<>();
    }
    
    public void add(int num) {
        ans.add(num);
    }
    
    public int getProduct(int k) {
        int product = 1;
        for(int i=0 ; i<k ; i++){
            product*=ans.get(ans.size()-i-1);
        }
        if(ans.size()==0) return 0 ;
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */