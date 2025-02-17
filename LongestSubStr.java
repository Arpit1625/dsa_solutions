import java.util.HashMap;

public class LongestSubStr {
    public static void main(String[] args) {
        String str = "aabacbebebe";
        int k = 3;
        System.out.println(LongestSubStr.longestkSubstr(str, k));
    }
    static int longestkSubstr(String s, int k) {
        int i  =0;
        int j = 0;
        HashMap <Character,Integer> hm = new HashMap<>();
        int substr = -1;
        while(i <  s.length()){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i), 0)+1);
            while(hm.size() > k){
                hm.put(s.charAt(j) , hm.getOrDefault(s.charAt(j),0)-1);
                if(hm.get(s.charAt(j))  == 0){
                    hm.remove(s.charAt(j));
                }
                j++;
            }
            if(hm.size() == k){
                substr = Math.max(substr, i-j+1);
            }
            i++;
        }
        return substr;   
    }
}
