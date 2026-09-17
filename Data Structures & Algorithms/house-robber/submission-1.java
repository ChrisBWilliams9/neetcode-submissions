class Solution {
    public int rob(int[] nums) {
        int firstPrevious = 0;
        int secondPrevious = 0;

        for (int i = 0; i < nums.length; i++) {
            int temp = Math.max(firstPrevious + nums[i], secondPrevious);
            firstPrevious = secondPrevious;
            secondPrevious = temp;
        }

        return secondPrevious;
    }
}
