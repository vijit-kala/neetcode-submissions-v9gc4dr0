class Solution {
    public boolean isPalindrome(String s) {
        String procStr = process(s);
        
        int l = 0, r = procStr.length()-1;

        while(l <= r) {
            if(procStr.charAt(l) != procStr.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }

    private String process(String str) {
        String res = Arrays.stream(str.split(" "))
            .map(String::trim)
            .filter(s -> !s.isEmpty())
            .map(s -> s.replaceAll("[^a-zA-Z0-9]", ""))
            .map(String::toLowerCase)
            .collect(Collectors.joining(""));
        
        return res;
    }
}
