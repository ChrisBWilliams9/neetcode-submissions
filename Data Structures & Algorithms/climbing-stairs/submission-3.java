class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int stepsDown1 = 2;
        int stepsDown2 = 1;

        for (int current = 3; current <= n; current++) {
            int currentWays = stepsDown1 + stepsDown2;

            stepsDown2 = stepsDown1;
            stepsDown1 = currentWays;
        }
        return stepsDown1;
    }
}
