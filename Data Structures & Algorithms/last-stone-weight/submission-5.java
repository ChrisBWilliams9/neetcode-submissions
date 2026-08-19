class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() >= 2) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x > y) {
                maxHeap.offer(x - y);
            } 
        }

        if (maxHeap.isEmpty()) {
            return 0;
        }

        return maxHeap.peek();
    }
}
