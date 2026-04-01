class Solution {
    public int findMin(int[] nums) {
        // linear search
        // int min = nums[0];
        // for(int i=1; i<nums.length; i++) {
        //     if(nums[i] < min)
        //         min = nums[i];
        // }

        // return min;

        // binary search
        int l = 0, h = nums.length-1;

        int min = nums[0];

        while(l <= h) {
            if(nums[l] < nums[h]) {
                min = Math.min(min, nums[l]);
                break;
            }

            int m = l + (h - l) /2;
            min = Math.min(min, nums[m]);
            if(nums[m] >= nums[l])
                l = m + 1;
            else
                h = m - 1;
        }

        return min;
    }
}
