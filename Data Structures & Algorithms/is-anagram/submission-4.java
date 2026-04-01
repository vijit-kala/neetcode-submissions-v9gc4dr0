class Solution {
    public boolean isAnagram(String s, String t) {
        // Sort and compare
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return (Arrays.compare(arr1, arr2) == 0) ? true : false;
    }
}
