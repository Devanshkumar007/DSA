class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // prefix[i] = length of increasing sequence ending at i
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                prefix[i] = prefix[i - 1] + 1;
            } else {
                prefix[i] = 1;
            }
        }

        // suffix[i] = length of decreasing sequence starting at i
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > arr[i + 1]) {
                suffix[i] = suffix[i + 1] + 1;
            } else {
                suffix[i] = 1;
            }
        }

        int maxMountain = 0;
        for (int i = 0; i < n; i++) {
            if (prefix[i] > 1 && suffix[i] > 1) { // valid peak
                maxMountain = Math.max(maxMountain, prefix[i] + suffix[i] - 1);
            }
        }

        return maxMountain;
    }
}
