class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) 
    {
        map<int, int> frq;
        for (const int num : nums)
            frq[num]++;

        vector<pair<int, int>> frqs(frq.begin(), frq.end());

        sort(frqs.begin(), frqs.end(), [](const pair<int, int> &a, const pair<int, int> &b) {
            return a.second > b.second;
        });

        vector<int> ans;

        for (int i = 0; i < k; i++)
            ans.push_back(frqs[i].first);

        return ans;    
    }
};
