class Power{
    public static void main(String[] args) {
        double x = 2;
        int m = 10;
        System.out.println( myPow(x, m));
    }
    static double myPow(double x , int n){
        double ans = 1.0;
        long k = n;
        if (k < 0) {
            k = -1 * k;
        }
        while (k > 0) {
          if (k % 2 == 1) {
            ans = ans * x;
            k = k - 1;
          } else {
            x = x * x;
            k =k / 2;
          }
        }
        if (n < 0) ans = (double)(1.0) / (double)(ans);
        return ans;
    }
}