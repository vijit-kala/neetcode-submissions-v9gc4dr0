class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Sorting approach -> O(NlogN), O(1)
        // Arrays.sort(nums);

        // for(int i=0; i<nums.length-1; i++) {
        //     if(nums[i] == nums[i+1])
        //         return true;
        // }

        // return false;

        // Count based approach -> O(N), O(N)
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 1)
                return true;
        }

        return false;
    }
}