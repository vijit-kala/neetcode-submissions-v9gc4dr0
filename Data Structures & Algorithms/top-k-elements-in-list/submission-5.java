class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> cntMap = new HashMap<>();

        for(int num: nums) {
            cntMap.merge(num, 1, Integer::sum);
        }

        // List<Integer> topK = cntMap.entrySet()
        //     .stream()
        //     .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
        //     .limit(k)
        //     .map(Map.Entry::getKey)
        //     .collect(Collectors.toList());

        // int[] res = new int[k];
        
        // for(int i=0; i<k; i++)
        //     res[i] = topK.get(i);

        // return res;

        // using PQ
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());
        
        for(Map.Entry<Integer, Integer> entry: cntMap.entrySet()) {
            pq.offer(entry);
            if(pq.size() > k)
                pq.poll();
        }

        int[] res = new int[k];
        for(int i=k-1; i>=0; i--)
            res[i] = pq.poll().getKey();

        return res;
    }
}
