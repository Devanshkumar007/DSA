class Solution {
    public int myAtoi(String s) {
        int i=0;
        StringBuilder sb = new StringBuilder();
        if(s.length()==0) return 0;
        while(i<s.length() && s.charAt(i)==' ') i++;
        int sign = 1 ;
        if(i <s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-') ) sign = s.charAt(i++)=='+' ? 1 : -1 ;
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9' ) sb.append(s.charAt(i++));


        //System.out.println(Double.parseDouble(sb.toString()));
        if(sb.length()==0) return 0 ;
        if (sign*Double.parseDouble(sb.toString()) <= Integer.MIN_VALUE) return Integer.MIN_VALUE ; 
        if (sign*Double.parseDouble(sb.toString()) >= Integer.MAX_VALUE) return Integer.MAX_VALUE ;
        return sign * Integer.parseInt(sb.toString());
    }
}