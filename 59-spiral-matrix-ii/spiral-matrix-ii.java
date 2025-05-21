class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0 , bottom = n-1 ;
        int left = 0 , right =n-1 ;

        int input=1;

        while(top<=bottom && right >= left){
            //right 
            for(int i=left;i<=right;i++){
                ans[top][i]=input++;
            }
            top++;
            //bottom
            for(int i=top; i<=bottom ;i++){
                ans[i][right]=input++;
            }
            right--;
            //left
            for(int i=right; i>=left ; i--){
                ans[bottom][i] = input++;
            }
            bottom--;
            //up
            for(int i=bottom ; i>=top ; i--){
                ans[i][left] = input++;
            }
            left++;
        }

        return ans;
    }
}