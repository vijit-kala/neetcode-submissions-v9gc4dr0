class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int ans = 0;

        for(int num: nums) {
            if(set.contains(num)) {
                ans = num;
                break;
            }

            set.add(num);
        }

        return ans;
    }
}
