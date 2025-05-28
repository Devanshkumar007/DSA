class Solution {
    public int differenceOfSums(int n, int m) {
        int div = m ;
        int sum = 0 ;
        while(div<=n && m <=n){
            sum += div;
            //System.out.println(div+" "+sum);
            div+=m;
        }
        int total = (n * (n+1) / 2) ; 
        //System.out.println(total);
        return  total - 2*sum ;
    }
}