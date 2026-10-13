class Solution {
    public int lastStoneWeight(int[] stones) {
        // Max queue
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int y = queue.poll();
            int x = queue.poll();
  
            if (y > x) {
                queue.offer(y - x);
            }

            if (queue.isEmpty()) {
                return 0;
            }
        }

        return queue.peek();

    }
}
