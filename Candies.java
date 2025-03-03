import java.util.ArrayList;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3};
        int x = 2;
        System.out.println(kidsWithCandies(arr, x));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> li = new ArrayList<>();
        int max = 0;
        for (int i = 0; i <candies.length; i++) {
            if(max <= candies[i]){
                max = candies[i];
            }
        }
        for (int i = 0; i <candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if(sum >= max){
                li.add(true);
            }else {
                li.add(false);
            }
        }
        return li;
    }
}
