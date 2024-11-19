import java.util.ArrayList;
import java.util.List;

public class Pascal {
    public static void main(String[] args) {
        List<List<Integer>> res = generate(3);
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j));
            }
            System.out.println();
        }
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer> >res = new ArrayList<>();
        List<Integer> previousList2 = new ArrayList<>();
        previousList2.add(1);
        res.add(previousList2);
        if(numRows <3){
            return res ;
        }
         for (int i = 2; i <= numRows; i++) {
            List <Integer> newList = new ArrayList<>();
            newList.add(0, 1);
            for (int j = 1; j <= i-2 ; j++) {
                newList.add(previousList2.get(j)+previousList2.get(j-1));
            }
            newList.add(1);
            res.add(newList);
            previousList2 = newList ;
         }
        return res;
    }
}
