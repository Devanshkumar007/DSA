class Solution {
    public int countCollisions(String directions) {
        int count = 0 ;
        int front = 0;
        int back = directions.length()-1;
        while(front<=back && directions.charAt(front)=='L') front++;
        while(back>=0 && directions.charAt(back)=='R') back--;
        for(int i=front;i<=back ;i++){
            count++;
            if(directions.charAt(i)=='S') count--;
        }
        return count;
    }
}