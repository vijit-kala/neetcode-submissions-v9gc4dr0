class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;

        for(int i=0; i<n; i++) {
            int h = heights[i];

            int r = i + 1;
            while(r < n && heights[r] >= h) {
                r++;
            }

            int l = i;
            while(l >= 0 && heights[l] >= h) {
                l--;
            }

            r--;
            l++;
            maxArea = Math.max(maxArea, h * (r - l + 1));
        }

        return maxArea;
    }
}
