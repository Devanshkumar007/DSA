class Solution {
    public int longestCommonSubsequence(String text1, String text2){
        try {
            Callable<Integer> func = ()-> solve(text1, text2);
            FutureTask<Integer> task = new FutureTask(func);
            new Thread(task).start();
            return task.get();
        } catch(Exception ex) {return 0;}
    }
    int solve(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        if(m == 0 || n == 0)
            return 0;
        
        int[] current = new int[n+1];
        int[] prev = new int[n+1];
        for(int i=1; i <= m ; i++) {
            for(int j=1; j <=n; j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    current[j] = 1+prev[j-1];
                } else {
                    current[j] = Math.max(current[j-1], prev[j]);
                }
            }
            System.arraycopy(current, 0, prev, 0, current.length);
        }
        return prev[n];
    }
}