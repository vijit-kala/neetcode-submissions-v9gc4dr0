class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if(nums.size() < 1)
            return 0;
        
        set<int> numSet(nums.begin(), nums.end());
        vector<int> vec(numSet.begin(), numSet.end());

        int ans = 1, len = 1, prev = 0, curr = 1;

        while(curr < vec.size()) {
            if(vec[curr] - vec[prev] == 1)
                len++;
            else {
                ans = max(ans, len);
                len = 1;
            }
            prev++, curr++;
        }

        ans = max(ans, len);
        return ans;
    }
};
