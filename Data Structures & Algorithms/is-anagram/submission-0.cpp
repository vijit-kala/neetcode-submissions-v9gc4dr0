class Solution {
public:
    bool isAnagram(string s, string t) 
    {
        vector<int> freqS(26, 0), freqT(26, 0);

        for(char ch: s)
            freqS[ch - 'a']++;
        for(char ch: t)
            freqT[ch - 'a']++;

        for(int i=0; i<26; i++)
        {
            // cout << freqS[i] << ", " << freqT[i] << endl;

            if(freqS[i] != freqT[i])
                return false;
        }    

        return true;
    }
};
