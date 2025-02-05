public class LongestOdd {
    public static void main(String[] args) {
        String s = "52";
        s = s.trim();
        // if(s ==  ""){
        //     System.out.println("");
        // }
        // Long n = Long.parseLong(s);
        // Long ans = Long.MIN_VALUE;
        // while(n>0){
        //     if(n%2 != 0){
        //         ans = Math.max(ans, n);
        //         System.out.println(ans);
        //     } 
        //     Long k = n%10;
        //     n = n/10;
        //     if(k%2 !=  0){
        //         ans = Math.max(ans,k);
        //     }
        //     else{
        //         continue;
        //     }
        // }
        // if(ans < 0){
        //     s = "";
        // }
        // else{
        //     s =  Long.toString(ans);
        // }
        // System.out.println(s); code is correct but fails in number larger than Long.Max_Value
          
        //not otimized
        // if (s.isEmpty()) {
        //     System.out.println("");
        //     return;
        // }
        // String ans = "";
        // for (int i = 0; i < s.length(); i++) {
        //     if ((s.charAt(i) - '0') % 2 != 0) {
        //         ans = s.substring(0, i + 1);
        //     }
        // }
        // System.out.println(ans);

        int n=s.length();
        String ans ="";
        for(int i=0;i<n;i++){
            int x=s.charAt(i) - '0';
            if(x%2!=0){
                ans = s.substring(0,i+1);
            }
        }
        System.out.println(ans); 
    }
}
