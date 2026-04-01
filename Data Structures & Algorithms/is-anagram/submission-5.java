class Solution {
    public boolean isAnagram(String s, String t) {
        // Sort and compare -> O(NlogN), O(N)
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // return (Arrays.compare(arr1, arr2) == 0) ? true : false;

        // Freq Count -> O(N), O(1) -> Size of frq arr is fixed

        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];
        Arrays.fill(freq, 0);

        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for(int f: freq) {
            if(f != 0)
                return false;
        }

        return true;
    }
}
