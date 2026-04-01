class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr = new StringBuilder();

        for(String str: strs) {
            int len = str.length();
            encodedStr.append(len).append('#').append(str);
        }

        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();

        int i = 0;

        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#')
                j++;
            int len = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j+1+len);
            strs.add(word);
            i = j + 1 + len;
        }
        return strs;
    }
}
