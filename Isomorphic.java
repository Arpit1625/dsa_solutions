import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String a = "badc";
        String b = "baba";
        System.out.println(Isomorphic.isIsomorphic(a, b));
    }
    static boolean isIsomorphic(String s, String t){
        HashMap <Character , Character> hm = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        for(int i =0; i < s.length(); i++){
            if(hm.get(s.charAt(i)) == null && hm.containsValue(t.charAt(i)) == false){
                hm.put(s.charAt(i), t.charAt(i));
                ans = ans.append(t.charAt(i));
            }
            else{
                ans =  ans.append(hm.get(s.charAt(i)));
            }
        }
        if(t.equals(ans.toString())){
            return true;
        }
        return false;
    }
}
