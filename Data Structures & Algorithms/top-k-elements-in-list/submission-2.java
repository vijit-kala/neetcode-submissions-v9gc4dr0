class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> sortedKeys = map.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        int[] ans = new int[k];
        for(int i=0; i<k; i++)
            ans[i] = sortedKeys.get(i);

        return ans;
    }
}
