public class MagicalString {
    public static int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1;

        int[] magic = new int[n + 1];
        magic[0] = 1;
        magic[1] = 2;
        magic[2] = 2;

        int countOnes = 1;
        int index = 2;
        int num = 1;
        int write = 3;

        while (write < n) {
            for (int i = 0; i < magic[index] && write < n; i++) {
                magic[write] = num;
                if (num == 1) countOnes++;
                write++;
            }
            num = (num == 1) ? 2 : 1;
            index++;
        }
        return countOnes;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(magicalString(n)); 
    }
}
