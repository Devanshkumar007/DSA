class Solution {
    public int maxArea(int[] height) {
        int area = 0 ;
        int i = 0;
        int j = height.length-1;
        while(i<j){
            int l = Math.min(height[i],height[j]);
            int b = j-i;
            area = Math.max(area,l*b);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return area;
    }
}