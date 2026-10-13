class Solution {
    public int[][] kClosest(int[][] points, int k) {


        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];

            int distance = x * x + y * y;

            queue.offer(new int[] {distance, i});

            if (queue.size() > k) {
                queue.poll();
            } 
        }

        int[][] res = new int[k][];

        for (int i = 0; i < res.length; i++) {
            res[i] = points[queue.poll()[1]];
        }


        return res;
    }
}
