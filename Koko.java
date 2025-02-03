public class Koko {
    public static void main(String[] args) {
        Koko ko = new Koko();
        int arr[] = {30,11,23,4,20};
        int h = 6;
        System.out.println(ko.minEatingSpeed(arr,h));
    }
    public int minEatingSpeed(int[] piles, int h){
        int total = 0;
        int max = 0;
        for(int i=0; i<piles.length ; i++){
            total = total + piles[i];
            max = Math.max(max, piles[i]);
        }
        int min = 1;
        while(min <= max){
            int totalh = 0;
            int mid = min + (max-min)/2;
            for(int i=0; i< piles.length; i++){
                totalh = (int) (totalh + Math.ceil ((double)piles[i]/(double)mid));
            }
            if(totalh <= h){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return min;
    }
}
