class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        int ans = r;

        while(l <= r) {
            int m = (l + r) / 2;

            long tt = 0;
            for(int pile: piles) {
                tt += Math.ceil((double) pile / m);
            }

            if(tt <= h) {
                ans = m;
                r = m-1;
            } else {
                l = m + 1;
            }
        }

        return ans;
    }
}
