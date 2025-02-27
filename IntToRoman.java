class IntToRoman {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumeral = new StringBuilder();  
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                romanNumeral.append(symbols[i]);
                num -= values[i];
            }
        }   
        return romanNumeral.toString();
    }
    public static void main(String[] args) {
        IntToRoman itor = new IntToRoman();
        System.out.println(itor.intToRoman(3));
        System.out.println(itor.intToRoman(4));
        System.out.println(itor.intToRoman(9));
        System.out.println(itor.intToRoman(58));
        System.out.println(itor.intToRoman(1994));
    }
}
