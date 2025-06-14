class Solution {
    public int minMaxDifference(int num) {
        String number = num+"";
        char[] max = number.toCharArray();
        char[] min = number.toCharArray();
        int i=0 ;
        while(i<max.length && max[i]=='9') i++ ;
        char selected = (i<max.length) ? max[i] : '.' ;
        for(int j=i ;j<max.length ; j++){
            if(max[j]==selected) max[j] = '9' ; 
        }
        
        selected=min[0];
        for(int j=0 ; j<min.length ; j++){
            if(min[j]==selected) min[j]='0' ;
        }
        String n1 = new String(max);
        String n2 = new String(min);
        return Integer.parseInt(n1) - Integer.parseInt(n2);
    }
}