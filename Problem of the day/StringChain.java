import java.util.Arrays;
import java.util.HashMap;

public class StringChain {
    public static void main(String args[]){
        String [] st = {"abcd", "dbqca"};
        System.out.print(longestStringChain(st));
    }
    static int longestStringChain(String words[]) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        HashMap <String , Integer> hm = new HashMap<>();
        int max = 1;
        for(int i = 0; i < words.length; i++){
            hm.put(words[i], 1);
            for(int j =0; j < words[i].length() ; j++){
                String s = words[i].substring(0, j) + words[i].substring(j + 1);
                if (hm.containsKey(s)) {
                    hm.put(words[i], Math.max(hm.get(words[i]), hm.get(s) + 1));
                }
            }
            max = Math.max(max, hm.get(words[i]));
        }
        return max;
    }
}
