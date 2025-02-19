class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean[m][n];
        int min = 0 ;
        boolean executed = true ;
        while(executed){
        Queue<Pair<Integer,Integer>> queue = new LinkedList<>();
        int count = 0 ;
        //put true for curr min
        for(int i= 0 ;i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==2 && !visited[i][j] ){
                    count++;
                    visited[i][j]= true ;
                    queue.add(new Pair<>(i,j));
                }
            }
        }
        
        // rotten for curr min 
        if(!queue.isEmpty()) min++;
        while(!queue.isEmpty()){
            Pair<Integer, Integer> ij = queue.poll();
            int i = ij.getKey();
            int j = ij.getValue();
            //System.out.println(ij);

               try{if(grid[i-1][j]==1) grid[i-1][j] = 2;} catch(Exception e) {}
               try{if(grid[i+1][j]==1) grid[i+1][j] = 2;} catch (Exception e) {}
               try{if(grid[i][j+1]==1) grid[i][j+1] = 2;} catch (Exception e) {}
               try{if(grid[i][j-1]==1) grid[i][j-1] = 2;} catch (Exception e) {}
            
        }
        
        if(count==0) executed = false; 

    }

    for(int i= 0 ;i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
    }
    return (min!=0) ? min-1 : 0 ;
    }
}