import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s = "rat";
        String b = "car";
        System.out.println(Anagram.isAnagram(s, b));
    }
    static boolean isAnagram(String s , String t){
        // if(s.length() != t.length()){
        //     return false;
        // }
        // HashMap <Character,Integer> hm = new HashMap<>();
        // for(int i=0 ; i< s.length(); i++){
        //     hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i =0; i< t.length(); i++){
        //     if(hm.get(t.charAt(i)) == null){
        //         return false;
        //     }
        //     hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
        // }
        // for(int i =0; i< t.length(); i++){
        // System.out.println(hm.get(s.charAt(i)));
        // }
        // for(int i=0; i< s.length(); i++){
        //     if(hm.get(s.charAt(i)) != 0){
        //         return false;
        //     }
        // }
        // return true;
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
