public class ReverseWord {
    public static void main(String[] args) {
        String s = "a                           man";
        // s = s.trim();
        // String b = "";
        // for(int i = s.length()-1; i>=0 ; i--){
        //     b = b + s.charAt(i) ;
        // }
        // b = b+ " ";
        // int i =0;
        // String res = "";
        // for(int j =0; j<b.length(); j++){
        //     if(b.charAt(j) == ' '){
        //         if(b.charAt(j) == ' ' && b.charAt(j-1)==' '){
        //             i=j+1;
        //             continue;
        //         }
        //         for(int k = j-1;  k >= i;  k--){
        //             res = res+b.charAt(k); 
        //         }
        //         res = res + " ";
        //         i=j+1;
        //     }
        // }
        // res = res.trim();
        // System.out.println(res);
        s = s.trim();
        String[] words = s.split("\\s+");
        String result = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }
        
        result = result.trim();
        System.out.println(result);
    }
}
