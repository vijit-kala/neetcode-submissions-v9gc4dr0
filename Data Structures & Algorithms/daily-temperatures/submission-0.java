class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // Brute force
        int n = temperatures.length;
        int[] ans = new int[n];

        ans[n-1] = 0;

        for(int i=0; i<n-1; i++) {
            int cnt = 0;
            boolean isFound = false;
            for(int j=i+1; j<n; j++) {
                if(temperatures[j] > temperatures[i]) {
                    ++cnt;
                    isFound = true;
                    break;
                }
                cnt++;
            }

            ans[i] = (isFound) ? cnt : 0;
        }

        return ans;
    }
}
