// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        // code here
        //ArrayList<Integer> ans = new ArrayList<>;
        Stack<Integer> st = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            int curr = arr[i];
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            if(st.isEmpty()) arr[i] = -1;
            else arr[i]= st.pop();
            st.push(curr);
        }
        
    }
}