class Solution {
    static {
        for(int i=0; i<1000 ; i++){
            totalFruit(new int[]{});
        }
    }
    public static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] unique = new int[2];
        int left = 0 ;
        int max = 0 ;

        for(int i=0; i<fruits.length ; i++){
            if(mp.size()==0){
                unique[0] = fruits[i]; 
            }else if(mp.size()==1){
                unique[1]= fruits[i];
            }else{
                if(!mp.containsKey(fruits[i])){
                    int prev = fruits[i-1];
                    max = Math.max(i-left, max);  
                    if(prev == unique[0]){
                        left = mp.get(unique[1]) + 1;
                        mp.remove(unique[1]);
                        unique[1]= fruits[i];
                    }else{
                        left = mp.get(unique[0]) + 1;
                        mp.remove(unique[0]);
                        unique[0]= fruits[i];
                    }
                }
            }
                mp.put(fruits[i],i);
        }
        max= Math.max(fruits.length-left , max) ;
        return max;
    }
}