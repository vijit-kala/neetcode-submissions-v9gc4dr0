class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Brute force -> O(N^2), O(N)
        // int n = nums.length;
        // int[] ans = new int[n];

        // for(int i=0; i<n; i++) {
        //     int prod = 1;
        //     for(int j=0; j<n; j++) {
        //         if(i == j)
        //             continue;
        //         prod = prod * nums[j];
        //     }
        //     ans[i] = prod;
        // }

        // return ans;

        // Prefix and Suffix arrays:
        int n = nums.length;
        int[] ans = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        for(int i=1; i<n; i++) {
            pref[i] = pref[i-1] * nums[i-1];
        }

        suff[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            suff[i] = suff[i+1] * nums[i+1];
        }

        for(int i=0; i<n; i++)
            ans[i] = pref[i] * suff[i];

        return ans;
    }
}  
