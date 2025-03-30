class Solution {
    boolean ans = false ;
    public void check(int n,HashSet<Integer> mp){
        int temp = 0 ;
        while(n>0){
            temp += Math.pow((n%10),2);
            n/=10;
        }
        if(mp.contains(temp)) {ans = false ; return ;}
        else mp.add(temp);
        if(temp==1) {ans= true; return;}
        check(temp,mp);
    }
    public boolean isHappy(int n) {
        if(n==1) return true ;
        HashSet<Integer> mp = new HashSet<>();
        check(n,mp);
        return ans;
    }
}