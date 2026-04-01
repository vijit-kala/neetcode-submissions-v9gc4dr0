class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int len = 0;

        // for(int i=0; i<s.length(); i++) {
        //     Set<Character> set = new HashSet<>();

        //     for(int j=i; j<s.length(); j++) {
        //         if(set.contains(s.charAt(j)))
        //             break;
        //         set.add(s.charAt(j));
        //     }
        //     len = Math.max(len, set.size());
        // }

        // return len;
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int l = 0;

        for(int r=0; r<s.length(); r++) {
            if(map.containsKey(s.charAt(r))) {
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }
            map.put(s.charAt(r), r);
            len = Math.max(len, r - l + 1);
        }
        return len;
    }
}
