public class TowerOfhanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(10, 1, 3, 2)); 
    }
    static int count = 0;
    static int towerOfHanoi(int n, int from, int to, int aux) {
        count++;
        if(n == 1){
            return 1;
        }
        return towerOfHanoi(n - 1, from, aux, to) + 1 + towerOfHanoi(n - 1, aux, to, from);
    }
}
