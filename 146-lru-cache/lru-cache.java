class LRUCache {
    LinkedHashMap<Integer,Integer> mp ;
    int capacity ;
    public LRUCache(int capacity) {
        this.mp = new LinkedHashMap<>(capacity);
        this.capacity = capacity ;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            int val = mp.get(key);
            mp.remove(key);
            mp.put(key,val);
            //System.out.println(mp);
            return val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
            if(mp.containsKey(key)) mp.remove(key);
            else if(mp.size()==capacity){
                Iterator<Integer> it = mp.keySet().iterator();
                it.next();
                it.remove();
            }
            mp.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */