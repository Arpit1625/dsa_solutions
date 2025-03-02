import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiffTwoArr {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result);
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(set1);
        List<Integer> list2 = new ArrayList<>(set2);
        
        for (int i = 0; i < list1.size(); i++) {
            if (!set2.contains(list1.get(i))) {
                diff1.add(list1.get(i));
            }
        }
        
        for (int i = 0; i < list2.size(); i++) {
            if (!set1.contains(list2.get(i))) {
                diff2.add(list2.get(i));
            }
        }
        
        return Arrays.asList(diff1, diff2);
    }
}
