import java.util.HashMap;

public class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int top = 0; top < rows; top++) {

            int[] colSum = new int[cols];

            for (int bottom = top; bottom < rows; bottom++) {

                for (int c = 0; c < cols; c++) {
                    colSum[c] += matrix[bottom][c];
                }

                count += subarraySum(colSum, target);
            }
        }

        return count;
    }

    private int subarraySum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - target, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
