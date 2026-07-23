class Solution {
    public int rob(int[] nums) {
        int rob2Back = 0;
        int rob1Back = 0;

        for (int num : nums) {
            int current = Math.max(rob2Back + num, rob1Back);
            rob2Back = rob1Back;
            rob1Back = current;
        }

        return rob1Back;
    }
}
