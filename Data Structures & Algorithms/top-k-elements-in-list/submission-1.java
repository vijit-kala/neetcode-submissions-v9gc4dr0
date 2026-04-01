class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int num: nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> sortedKeys = freq.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());

        int[] ans = new int[k];

        for(int i=0; i<k; i++) {
            ans[i] = sortedKeys.get(i);
        }

        return ans;
    }
}
