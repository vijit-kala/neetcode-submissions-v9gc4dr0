class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length) {
            var temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int m = nums1.length;
        int n = nums2.length;
        int t = m + n;
        int h = (t + 1) / 2;

        int l = 0, r = m;

        while(l <= r) {
            int i = (l + r) / 2;
            int j = h - i;

            int l1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int r1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int l2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int r2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if(l1 <= r2 && l2 <= r1) {
                if(t % 2 == 1) 
                    return Math.max(l1, l2);
                else
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else if(l1 > r2) {
                r = i-1;
            } else
                l = i + 1;
        }

        return -1;
    }
}
