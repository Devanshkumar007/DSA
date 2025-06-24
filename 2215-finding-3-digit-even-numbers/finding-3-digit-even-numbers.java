class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Arrays.sort(digits);
        int n = digits.length;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            for(int j=0; j<n ; j++){
                if(i==j) continue;
                for(int k=0;k<n ;k++){
                    if(k==i || k==j) continue;
                    int d1 = digits[i];
                    int d2 = digits[j];
                    int d3 = digits[k];
                    if(d1==0 || d3%2 != 0) continue ;
                    nums.add(d1*100 + d2*10 + d3);
                }
            }
        }

int [] ans = nums.size()>0 ?nums.stream().distinct().mapToInt(i -> i).toArray() : new int[0] ;
        
        return ans;
    }
}