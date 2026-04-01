class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;

        for(int i=0; i<s.length(); i++) {
            Set<Character> set = new HashSet<>();

            for(int j=i; j<s.length(); j++) {
                if(set.contains(s.charAt(j)))
                    break;
                set.add(s.charAt(j));
            }
            len = Math.max(len, set.size());
        }

        return len;
    }
}
