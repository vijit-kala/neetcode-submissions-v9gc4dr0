class TimeMap {

    record Pair(int t, String v){}

    Map<String, List<Pair>> timeMap;


    public TimeMap() {
        timeMap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!timeMap.containsKey(key))
            timeMap.put(key, new ArrayList<>());
        timeMap.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key))
            return "";

        List<Pair> entries = timeMap.get(key);
        int l = 0, h = entries.size() - 1;
        String res = "";

        while(l <= h) {
            int mid = (l + h) / 2;
            if(entries.get(mid).t == timestamp)
                return entries.get(mid).v;
            else if(entries.get(mid).t < timestamp) {
                res = entries.get(mid).v;
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return res;
    }
}
