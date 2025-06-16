class Solution {
    public int maxDiff(int num) {
        String n = num+"";
        int i=0;
        char[] max = n.toCharArray();
        char[] min = n.toCharArray();
        while(i<max.length && max[i]=='9') i++;
        char x = (i<max.length)?max[i]:0;
        for(int j=i ; j<max.length ; j++){
            if(max[j]==x) max[j]= '9' ;
        }
        char y = '1';
        char replace = '1' ;
        i=0;
        if(min[0]=='1'){
            while(i<min.length && (min[i]=='1' || min[i]=='0')) i++;
            y = i<min.length ? min[i] : 0;
            replace = '0' ;
        }
        else y=min[0];

        for(int j=i ; j<max.length ; j++){
            if(min[j]==y) min[j]= replace;
        }

        String n1 = new String(max);
        String n2 = new String(min);

        //System.out.println(n1+" "+n2);

        return Integer.parseInt(n1) - Integer.parseInt(n2) ;

    }
}