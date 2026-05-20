class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.length()).append("%").append(str);
        }

        // System.out.println(sb.toString());

        return sb.toString();
    }

    public List<String> decode(String str) {
        // return new ArrayList<String>();
        List<String> strs = new ArrayList<>();
        int idx = 0;
        for(int i=0; i<str.length();) {
            if(str.charAt(i) == '%') {
                int len = Integer.parseInt(str.substring(idx, i));
                idx = i + len + 1;
                strs.add(str.substring(i+1, idx));
                i = idx + 1;
            } else {
                i++;
            }
        }

        return strs;
    }
}
