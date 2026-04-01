class Solution {
    public int largestRectangleArea(int[] heights) {
        // Brute force O(N^2)
        int n = heights.length;
        int maxArea = 0;

        // for(int i=0; i<n; i++) {
        //     int h = heights[i];

        //     int r = i + 1;
        //     while(r < n && heights[r] >= h) {
        //         r++;
        //     }

        //     int l = i;
        //     while(l >= 0 && heights[l] >= h) {
        //         l--;
        //     }

        //     r--;
        //     l++;
        //     maxArea = Math.max(maxArea, h * (r - l + 1));
        // }

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<=n; i++) {
            while(!stack.isEmpty() && (i == n || heights[stack.peek()] >= heights[i])) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, h * w);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
