class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Brute force
        // Set<List<Integer>> ans = new HashSet<>();

        // int n = nums.length;

        // for(int i=0; i<n-2; i++) {
        //     for(int j=i+1; j<n-1; j++) {
        //         for(int k=j+1; k<n; k++) {
        //             if(nums[i] + nums[j] + nums[k] == 0) {
        //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(triplet); // normalize order
        //                 ans.add(triplet);
        //             }
        //         }
        //     }
        // }

        // return ans.stream().toList();

        // Optimization
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // Step 2: skip duplicate 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Step 3: skip duplicate 'left'
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Step 3: skip duplicate 'right'
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // need bigger sum
                } else {
                    right--; // need smaller sum
                }
            }
        }
        return ans;

    }
}
