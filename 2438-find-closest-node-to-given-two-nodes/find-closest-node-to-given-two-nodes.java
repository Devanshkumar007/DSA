class Solution {
    public void filling(int[] dist, int[] edges, int startNode) {
        boolean[] visited = new boolean[edges.length];
        int distance = 0;
        int current = startNode;

        while (current != -1 && !visited[current]) {
            dist[current] = distance;
            visited[current] = true;
            current = edges[current];
            distance++;
        }
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];
        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);

        filling(dist1, edges, node1);
        filling(dist2, edges, node2);

        int minDistance = Integer.MAX_VALUE;
        int answer = -1;

        for (int i = 0; i < n; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int maxDist = Math.max(dist1[i], dist2[i]);
                if (maxDist < minDistance || (maxDist == minDistance && i < answer)) {
                    minDistance = maxDist;
                    answer = i;
                }
            }
        }

        return answer;
    }
}
