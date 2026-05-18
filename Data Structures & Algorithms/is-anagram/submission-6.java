class Solution {
    public boolean isAnagram(String s, String t) {
        int[] cntS = new int[26];
        int[] cntT = new int[26];

        if(s.length() != t.length())
            return false;

        for(int i=0; i<s.length(); i++) {
            cntS[s.charAt(i) - 'a']++;
            cntT[t.charAt(i) - 'a']++;
        }

        for(int i=0; i<26; i++) {
            if(cntS[i] != cntT[i])
                return false;
        }

        return true;
    }
}
