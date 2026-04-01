class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // using map -> O(NlogN), O(K)
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int num: nums)
        //     map.put(num, map.getOrDefault(num, 0) + 1);

        // List<Integer> sortedKeys = map.entrySet().stream()
        //     .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
        //     .map(Map.Entry::getKey)
        //     .collect(Collectors.toList());

        // int[] ans = new int[k];
        // for(int i=0; i<k; i++)
        //     ans[i] = sortedKeys.get(i);

        // return ans;

        // Using minHeap(Priority Queue) -> O(NlogK), O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            minHeap.offer(entry);
            if(minHeap.size() > k)
                minHeap.poll();
        }

        int[] ans = new int[k];
        for(int i=k-1; i>=0; i--)
            ans[i] = minHeap.poll().getKey();

        return ans;
    }
}
