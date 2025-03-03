import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        List<Integer> li = new ArrayList<>();
        li = sequentialDigits(low, high);
        for(int i =0; i < li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 9; ++i) {
            int x = i;
            for (int j = i + 1; j < 10; ++j) {
                x = x * 10 + j;
                if (x >= low && x <= high) {
                    li.add(x);
                }
            }
        }
        Collections.sort(li);
        return li;
    }
}
