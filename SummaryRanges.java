import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int arr[] = {0,1,2,4,5,7};
        List <String> li = new ArrayList<>();
        li = summaryRanges(arr);
        for(int i = 0;i < li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
    static List<String> summaryRanges(int[] nums) {
        List<String> li = new ArrayList<>();
        if (nums.length == 0) {
            return li;
        }
        int start = nums[0];
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                addToResult(start, end, li);
                start = nums[i];
                end = nums[i];
            }
        }
        addToResult(start, end, li);
        return li;
    }
    static void addToResult(int start, int end, List<String> li) {
        if (start == end) {
            li.add(Integer.toString(start));
        } else {
            li.add(start + "->" + end);
        }
    }
}
