class Solution {
    public int trap(int[] height) {

        int n  = height.length;
        if(n == 0)
            return 0;

        int[] pref = new int[height.length];
        int[] suff = new int[height.length];

        pref[0] = height[0];
        for(int i=1; i<n; i++) 
            pref[i] = Math.max(height[i], pref[i-1]);

        suff[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
            suff[i] = Math.max(height[i], suff[i+1]);
        
        int ans = 0;
        for(int i=0; i<n; i++)
            ans += Math.min(pref[i], suff[i]) - height[i];
        return ans;
    }
}
