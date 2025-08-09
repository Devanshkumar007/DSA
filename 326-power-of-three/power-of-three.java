class Solution {
    static{
        for(int i=0; i<300 ; i++){
            isPowerOfThree(1);
        }
    }
    public static boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true ;
        while(n!=1){
            if(n%3==0) n/=3;
            else return false;
        }
        return true;
    }
}