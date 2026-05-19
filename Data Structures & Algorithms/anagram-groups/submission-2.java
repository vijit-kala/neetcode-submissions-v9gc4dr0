class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> grpMap = new HashMap<>();

        for(String str: strs) {
            String sortedStr = sortString(str);
            if(grpMap.containsKey(sortedStr)) {
                grpMap.get(sortedStr).add(str);
            } else {
                grpMap.put(sortedStr, new ArrayList<>());
                grpMap.get(sortedStr).add(str);
            }
        }

        List<List<String>> grps = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry: grpMap.entrySet()) {
            grps.add(entry.getValue());
        }

        return grps;
    }

    private String sortString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
