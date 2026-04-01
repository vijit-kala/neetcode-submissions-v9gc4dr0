class Solution {
    public int search(int[] nums, int target) {
        // linear search
        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] == target)
        //         return i;
        // }

        // return -1;

        // binary search -> finding pivot
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int m = (l + r) / 2;
            if(nums[m] > nums[r]) 
                l = m + 1;
            else
                r = m;
        }

        int pivot = l;

        int res = binSearch(nums, target, 0, pivot-1);
        if(res != -1)
            return res;

        return binSearch(nums, target, pivot, nums.length-1);
    }

    private int binSearch(int[] nums, int target, int l, int r) {
        while(l <= r) {
            int mid = (l + r) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return -1;
    }
}
