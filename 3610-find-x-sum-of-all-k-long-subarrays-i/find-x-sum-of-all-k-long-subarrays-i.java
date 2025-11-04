class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            // Count frequency in current window
            Map<Integer, Integer> freq = new HashMap<>();
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // Sort by frequency desc, then value desc
            List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
            list.sort((a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue(); // higher freq first
                }
                return b.getKey() - a.getKey(); // if tie, larger value first
            });

            // Get top x elements
            Set<Integer> topX = new HashSet<>();
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                topX.add(list.get(j).getKey());
            }

            // Sum elements in window that are in top x
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                if (topX.contains(nums[j])) {
                    sum += nums[j];
                }
            }

            ans[i] = sum;
        }
        return ans;
    }
}
