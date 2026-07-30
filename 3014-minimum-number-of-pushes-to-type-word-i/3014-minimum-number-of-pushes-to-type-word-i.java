class Solution {
    public int minimumPushes(String word) {
        int cnt = 1;
        int ans = 0;
        if(word.length() <= 8){
            return word.length();
        }
        int thre = 7;
        for(int i = 0; i < word.length(); i++){
            ans = ans + cnt;
            if(i == thre){
                thre = thre + 8;
                cnt++;
            }
        }
        return ans;
    }
}