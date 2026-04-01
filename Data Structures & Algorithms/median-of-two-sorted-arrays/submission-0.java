class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                mergedArr[k++] = nums1[i++];
            } else {
                mergedArr[k++] = nums2[j++];
            }
        }

        if(i < nums1.length) {
            while(i < nums1.length) {
                mergedArr[k++] = nums1[i++];
            }
        }

        if(j < nums2.length) {
            while(j < nums2.length) {
                mergedArr[k++] = nums2[j++];
            }
        }        

        if(k % 2 ==  1) {
            return (double)(mergedArr[k/2]);
        } else {
            return (double)((mergedArr[k/2 - 1] + mergedArr[k/2]) / 2.0);
        }
    }
}
