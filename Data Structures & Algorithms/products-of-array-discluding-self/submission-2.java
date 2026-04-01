class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Brute force
        int n = nums.length;
        int[] ans = new int[n];

        for(int i=0; i<n; i++) {
            int prod = 1;
            for(int j=0; j<n; j++) {
                if(i == j)
                    continue;
                prod = prod * nums[j];
            }
            ans[i] = prod;
        }

        return ans;
    }
}  
