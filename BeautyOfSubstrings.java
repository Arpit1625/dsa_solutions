public class BeautyOfSubstrings {
    public static void main(String[] args) {
        System.out.println(BeautyOfSubstrings.beautySum("aabcb")); 
    }
    static int beautySum(String s) {
        int totalBeauty = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;  
                
                totalBeauty += getBeauty(freq);
            }
        }

        return totalBeauty;
    }
    static int getBeauty(int[] freq) {
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        for (int f : freq) {
            if (f > 0) {
                maxFreq = Math.max(maxFreq, f);
                minFreq = Math.min(minFreq, f);
            }
        }
        return maxFreq - minFreq;
    }
}
