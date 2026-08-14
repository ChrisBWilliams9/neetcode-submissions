class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int totalLeft = (m + n + 1) / 2;

        int left = 0;
        int right = m;

        while (left <= right) {
            int part1 = left + (right - left) / 2;
            int part2 = totalLeft - part1;

            int maxLeft1;

            if (part1 == 0) {
                maxLeft1 = Integer.MIN_VALUE;
            } else {
                maxLeft1 = nums1[part1 - 1];
            }

            int minRight1;

            if (part1 == m) {
                minRight1 = Integer.MAX_VALUE;
            } else {
                minRight1 = nums1[part1];
            }

            int maxLeft2;

            if (part2 == 0) {
                maxLeft2 = Integer.MIN_VALUE;
            } else {
                maxLeft2 = nums2[part2 - 1];
            }

            int minRight2;

            if (part2 == n) {
                minRight2 = Integer.MAX_VALUE;
            } else {
                minRight2 = nums2[part2];
            }

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 0) {
                    int leftMax = Math.max(maxLeft1, maxLeft2);
                    int rightMin = Math.min(minRight1, minRight2);
                    return (double) (leftMax + rightMin) / 2.0;
                } else {
                    return (double) Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                right = part1 - 1;
            } else {
                left = part1 + 1;
            }
        }

        return 5.0;
    }
}
