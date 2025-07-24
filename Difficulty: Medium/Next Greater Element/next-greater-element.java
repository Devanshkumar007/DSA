class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=arr.length-1 ; i>=0 ; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            if(st.isEmpty()) ans.add(0,-1);
            else ans.add(0,st.peek());
            st.push(arr[i]);
        }
        return ans;
    }
}