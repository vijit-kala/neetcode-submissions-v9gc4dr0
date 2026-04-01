class TimeMap {

    class Pair {
        int t;
        String v;

        public Pair(int t, String v) {
            this.t = t;
            this.v = v;
        }
    }

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
        Pair min = new Pair(0, "");
        for(Pair entry: entries) {
            if(entry.t <= timestamp) {
                min = entry;
            }
        }

        return min.v;
    }
}
