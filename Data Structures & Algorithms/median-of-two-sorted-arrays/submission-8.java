class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] nums3 = new int[m + n];

        int k = 0;

        for (int i = 0; i < m; i++) {
            nums3[k] = nums1[i];
            k++;
        }

        for (int j = 0; j < n; j++) {
            nums3[k] = nums2[j];
            k++;
        }

        Arrays.sort(nums3);

        int total = nums3.length;

        if (total % 2 == 1) {
            return (double) nums3[total / 2];
        }

        int middleRight = total / 2;
        int middleLeft = middleRight - 1;
        return (double) (nums3[middleRight] + nums3[middleLeft]) / 2.0;
    }
}
