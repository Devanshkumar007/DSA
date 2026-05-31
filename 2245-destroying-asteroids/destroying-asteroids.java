class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass ;
        for(int i : asteroids){
            if(currMass < i) return false;
            currMass+=i;
        }

        return true ;
    }
}