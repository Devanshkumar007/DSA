class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        HashSet<Integer> factors = new HashSet<>();
        while(n%2==0){
            factors.add(2);
            n/=2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 2) {
            factors.add(n);
        }

        for(int num : factors){
            if(num!=2 && num!=3 && num!=5) return false;
        }
        return true;
    }
}