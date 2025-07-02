class Solution {
    public void add(List<List<Integer>> rooms , int index , Queue<Integer> keys){
        if(rooms.get(index).size()==0) return ;
        for(int i : rooms.get(index)){
            keys.add(i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> keys = new LinkedList<>();
        add(rooms,0,keys);
        visited[0]=true ;
        while(!keys.isEmpty()){
            int curr = keys.remove();
            if(!visited[curr]){
                visited[curr] = true ;
                add(rooms,curr,keys);
            }
        }
        for(int i=0 ; i<visited.length ; i++){
            if (!visited[i]) return false; 
        }
        return true;
    }
}