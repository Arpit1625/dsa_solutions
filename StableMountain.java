import java.util.ArrayList;
import java.util.List;

public class StableMountain {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5};
        int threshold = 2;
        List <Integer> li = new ArrayList<>();
        li = stableMountains(a, threshold);
        for(int i=0; i< li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> stableMountains = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i-1] > threshold) {
                stableMountains.add(i);
            }
        }
        return stableMountains;
    }
}
