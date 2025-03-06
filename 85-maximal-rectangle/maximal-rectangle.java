class Solution {
    public void leftSmaller(List<Integer> sl, int a[])
    {
        Stack<Integer> st= new Stack<>();
        for(int i=0 ; i<a.length ;i++){
            while(!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            if(st.isEmpty()) sl.add(-1);
            else sl.add(st.peek());
            st.push(i);
        }
        
    }
    public void rightSmaller(List<Integer> sr, int a[]){
        Stack<Integer> st= new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
            if (st.isEmpty()) sr.add(0, a.length);
            else sr.add(0, st.peek()); 
            st.push(i);
        }
    } 
    public int histogramArea(int[] heights) {
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        leftSmaller(left,heights);
        rightSmaller(right,heights);
        int max = 0 ;
        for(int i=0 ; i<heights.length; i++){
            int width= right.get(i)- left.get(i) - 1;
            int area = width * heights[i];
            max= Math.max(max,area);
        }
        return max;
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