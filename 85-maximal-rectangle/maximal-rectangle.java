class Solution {
    public int histogramArea(int histo[]) {
        Stack < Integer > st = new Stack < > ();
        int maxA = 0;
        int n = histo.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || histo[st.peek()] >= histo[i])) {
                int height = histo[st.peek()];
                st.pop();
                int width;
                if (st.empty())
                    width = i;
                else
                    width = i - st.peek() - 1;
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }

    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] area = new int[m];
        int max = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ;j++){
                if(i==0){
                    area[j]=matrix[i][j] - '0' ;
                }else{
                    if(matrix[i][j]=='0') area[j]=0;
                    else area[j]+=1;
                }
            }
            max = Math.max(histogramArea(area),max);
        }
        return max; 
    }
}