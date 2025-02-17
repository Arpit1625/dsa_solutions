import java.util.HashMap;

public class Substring {
    public static void main(String[] args) {
        String a = "aba";
        int h = 2;
        System.out.println(Substring.countSubstr(a, h));
    }
    static int countSubstr(String s, int k){
        return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
    }
    static int atMostKDistinct(String s, int k) {
        if (k == 0){
             return 0; 
            }
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int left = 0, count = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);

            while (freqMap.size() > k) {
                char leftChar = s.charAt(left);
                freqMap.put(leftChar, freqMap.get(leftChar) - 1);
                if (freqMap.get(leftChar) == 0) {
                    freqMap.remove(leftChar);
                }
                left++;
            }
            count += right - left + 1;  
        }

        return count;
    }
}
