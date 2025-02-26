public class SecondLargestDigit {
    public static int secondHighest(String s) {
        int first = -1, second = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num < first) {
                    second = num;
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}
