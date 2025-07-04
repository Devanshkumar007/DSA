class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        if(intervals.length==0) ans.add(newInterval); 
        for(int i=0 ; i<intervals.length;i++){
            if(intervals[i][0] > newInterval[0]) ans.add(newInterval);
            ans.add(intervals[i]);
        }
        if(intervals.length==ans.size()) ans.add(newInterval); 
        int i= 1 ;
        List<int[]> out = new ArrayList<>();
        int start = ans.get(0)[0];
        int end = ans.get(0)[1];
        while(i<ans.size()){
            if(ans.get(i)[0] <= end ) end=Math.max(end,ans.get(i)[1]);
            else{ out.add(new int[]{start,end});
            start = ans.get(i)[0];
            end = ans.get(i)[1];
            }
            i++;
        }
        out.add(new int[]{start,end});
        int[][] output = new int[out.size()][2];

        for(int j=0 ; j<out.size() ; j++){
            output[j] = out.get(j);
        }
        return output ;
        

    }
}