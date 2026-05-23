class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) {
            numSet.add(num);
        }

        int ans = 0;

        for(int num: numSet) {
            if(!numSet.contains(num-1)) {
                int len = 1;
                while(numSet.contains(num + len))
                    len++;
                ans = Math.max(len, ans);
            }
        }

        return ans;
    }
}
