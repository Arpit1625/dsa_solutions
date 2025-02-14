public class StringtoInteger {
    public static void main(String[] args) {
        String s = "1337c0d3";
        System.out.println(StringtoInteger.myAtoi(s));
    }
    static int myAtoi(String s){
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        long ans = 0;
        boolean neg = false;
        for(int i=0; i<s.length(); i++){
            if(i==0){
                if(s.charAt(i) == '-'){
                    neg  = true;
                    continue;
                }
                else if (s.charAt(i) == '+'){
                    continue;
                }
            }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                int num = s.charAt(i) - '0';
                ans = ans *10 + num;
                if(neg){
                    long check = -ans;
                    if(check < Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                }
                else{ 
                    if (ans > Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }
            }else{
                break;
            }
        }
        if (neg){
            return (int) (-ans);
        }
        return (int)  ans;
    }
}
