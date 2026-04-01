class Solution {
    public int longestConsecutive(int[] nums) {
        // Sort and check -> O(NlogN), O(N)
        // if(nums.length == 0)
        //     return 0;

        // Arrays.sort(nums);
        // int res = 0, curr = nums[0], streak = 0, i = 0;

        // while(i < nums.length) {
        //     if(curr != nums[i]) {
        //         curr = nums[i];
        //         streak = 0;
        //     }

        //     while(i < nums.length && nums[i] == curr) {
        //         i++;
        //     }
        //     streak++;
        //     curr++;
        //     res = Math.max(res, streak);
        // }

        // return res;

        // HashSet -> O(N), O(N)
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }

        int longest =  0;

        for(int num: numSet) {
            if(!numSet.contains(num-1)) {
                int len = 1;
                while(numSet.contains(num + len)) {
                    len++;
                }
                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}
