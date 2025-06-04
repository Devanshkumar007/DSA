class Solution {
    public String addBinary(String a, String b) {
        int one = a.length()-1;
        int sec = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0 ;
        while(one>=0 && sec>=0){
            int o = (a.charAt(one))-'0';
            int s = (b.charAt(sec))-'0';
            if(o+s+carry==0) { carry = 0 ; sb.insert(0,"0"); }
            else if( o+s+carry == 1 ) { carry=0; sb.insert(0,1); }
            else if( o+s+carry == 2 ) { carry=1; sb.insert(0,0); }
            else if( o+s+carry == 3 ) { carry=1; sb.insert(0,1); }
            one--; sec--;
        }
        while(sec>=0){
            int s = (b.charAt(sec))-'0';
            if(s+carry==0) { carry = 0 ; sb.insert(0,"0"); }
            else if( s+carry == 1 ) { carry=0; sb.insert(0,1); }
            else if( s+carry == 2 ) { carry=1; sb.insert(0,0); }
            else if( s+carry == 3 ) { carry=1; sb.insert(0,1); }
            sec--;
        }
        while(one>=0){
            int o = (a.charAt(one))-'0';
            if(o+carry==0) { carry = 0 ; sb.insert(0,"0"); }
            else if( o+carry == 1 ) { carry=0; sb.insert(0,1); }
            else if( o+carry == 2 ) { carry=1; sb.insert(0,0); }
            else if( o+carry == 3 ) { carry=1; sb.insert(0,1); }
            one--;
        }
        if(carry==1) sb.insert(0,1);

        return sb.toString();


    }
}