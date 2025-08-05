class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int left = 0 ;
        int max = 0 ;
        for(int i=0; i<fruits.length ; i++){
           if (mp.size()==2 && !mp.containsKey(fruits[i])){
                    max = Math.max(i-left, max);  
                    Iterator<Integer> it = mp.keySet().iterator();
                    int key = it.next();
                    if(fruits[i-1] == key) key = it.next();
                    left = mp.get(key)+1;
                    mp.remove(key);
                }
                mp.put(fruits[i],i);
        }
        max= Math.max(fruits.length-left , max) ;
        return max;
    }
}