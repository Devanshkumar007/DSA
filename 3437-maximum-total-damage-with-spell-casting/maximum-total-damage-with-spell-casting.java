class Solution {
    public long maximumTotalDamage(int[] power) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int p : power) {
            freq.put(p, freq.getOrDefault(p, 0) + 1);
        }

        Integer[] unique = freq.keySet().toArray(new Integer[0]);
        Arrays.sort(unique);

        int n = unique.length;
        long[] dp = new long[n];
        dp[0] =(long) unique[0] * freq.get(unique[0]);

        for (int i = 1; i < n; i++) {
            long pick = (long) unique[i] * freq.get(unique[i]);

            // find last index j where unique[j] <= unique[i] - 3
            int j = i - 1;
            while (j >= 0 && unique[i] - unique[j] < 3) {
                j--;
            }

            if (j >= 0) {
                pick += dp[j];
            }

            dp[i] = Math.max(dp[i - 1], pick);
        }

        return dp[n - 1];
    }
}
