class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        String s11 = new String(a1);

        for(int i=0; i<s2.length(); i++){
            for(int j=i; j<s2.length(); j++){
                char[] sub2 = s2.substring(i, j+1).toCharArray();
                Arrays.sort(sub2);
                String s22 = new String(sub2);
                if(s11.equals(s22))
                    return true;

            }
        }

        return false;
    }
}
