class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Brute force -> O(N^2), O(N)
        int n = temperatures.length;
        // int[] ans = new int[n];

        // ans[n-1] = 0;

        // for(int i=0; i<n-1; i++) {
        //     int cnt = 0;
        //     boolean isFound = false;
        //     for(int j=i+1; j<n; j++) {
        //         if(temperatures[j] > temperatures[i]) {
        //             ++cnt;
        //             isFound = true;
        //             break;
        //         }
        //         cnt++;
        //     }

        //     ans[i] = (isFound) ? cnt : 0;
        // }

        // return ans;

        // Stack
        int[] ans = new int[n];
        Arrays.fill(ans, 0);

        Stack<int[]> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                ans[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }

        return ans;

    }
}
