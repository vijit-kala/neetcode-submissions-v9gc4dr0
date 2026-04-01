class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force -> O(N^2), o(1)
        // for(int i=0; i<nums.length - 1; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[i] + nums[j] == target)
        //             return new int[] {i, j};
        //     }
        // }
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int n = nums[i];
            int diff = target - n;
            if(map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            map.put(nums[i], i);
        }

        // If no pair
        return new int[] {0, 0};
    }
}
