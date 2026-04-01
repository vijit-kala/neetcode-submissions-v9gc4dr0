class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        for(String str: strs) {
            sb.append(str.length()).append(',');
        }
        sb.append('#');

        for(String str: strs) {
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0)
            return Collections.emptyList();

        List<String> res = new ArrayList<>();
        int i = 0;

        List<Integer> sizes = new ArrayList<>();
        while(str.charAt(i) != '#') {
            int j = i;
            while(str.charAt(j) != ',')
                j++;
            sizes.add(Integer.parseInt(str.substring(i, j)));
            i = j + 1;
        }

        i++;
        for(int size: sizes) {
            res.add(str.substring(i, i + size));
            i += size;
        }

        return res;
    }
}
