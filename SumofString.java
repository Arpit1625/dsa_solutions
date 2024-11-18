public class SumofString {
    public static void main(String[] args) {
        String  s1 = "63457", s2 = "645";
        System.out.print(add(s1, s2));
    }
    static String add(String s1, String s2)
    {
        StringBuilder result = new StringBuilder();

        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        int carry = 0;
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);
            carry = sum / 10;       

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
