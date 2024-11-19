import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int [] arr = {16, 17, 4, 3, 5, 2};
        ArrayList <Integer>li = new ArrayList<>();
        li = leaders(arr);
        for(int i=0; i<li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
     static ArrayList<Integer> leaders(int arr[]) {
        ArrayList <Integer>li = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>=max){
                li.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(li);
        return li;
    }
}
