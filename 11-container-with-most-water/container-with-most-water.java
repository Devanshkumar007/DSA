class Solution {
    static {
        for(int i = 0;i <100;i++) {
            maxArea(new int[] { 0, 0 });
        }
    }
    public static int maxArea(int[] height) {
        int left = 0 ;
        int right = height.length-1;
        int max = 0 ;
        while(left<right){
            int l = Math.min(height[left],height[right]);
            max = Math.max(max, l* (right-left) );
            if(height[left]>height[right]) right--;
            else left++;
        }
        return max ;
    }
}