import java.util.HashMap;

public class RomantoInteger {
    public static void main(String[] args) {
        String a = "MCMXCIV";
        System.out.println(RomantoInteger.romantoInt(a));
    }
    static int romantoInt(String s){
        int number = 0;
        HashMap <Character,Integer> hm = new HashMap<>();
        hm.put('I' ,1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D', 500);
        hm.put('M',1000);
        for(int i = s.length() -1 ; i > 0 ; i--){
            int temp = hm.get(s.charAt(i-1));
            if(hm.get(s.charAt(i)) <= temp){
                number = number + hm.get(s.charAt(i));
            }
            else{
                number = number + (hm.get(s.charAt(i))-temp);
                i-=1;
            }
        }
        if(hm.get(s.charAt(0)) >= hm.get(s.charAt(1))){
            number = number + hm.get(s.charAt(0));
        }
        return number;
    }
}
