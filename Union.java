import java.util.ArrayList;
public class Union {
    public static void main(String[] args) {
        int arr1[] = {-8 ,-3, -3, -2, 0, 1, 2, 2, 6};
        int arr2[] = {-9 ,-9 ,0};
        disp (unionOfArray(arr1, arr2));
    }
    public static ArrayList <Integer> unionOfArray(int []arr1 , int []arr2){
        ArrayList <Integer> li = new ArrayList<>();
        int i = 0;
        int j=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) 
            {
              if (li.size() == 0 || li.get(li.size()-1) != arr1[i])
                li.add(arr1[i]);
              i++;
            } else 
            {
              if (li.size() == 0 || li.get(li.size()-1) != arr2[j])
                li.add(arr2[j]);
              j++;
            }
          }
          while (i < arr1.length)
          {
            if (li.get(li.size()-1) != arr1[i])
              li.add(arr1[i]);
            i++;
          }
          while (j < arr2.length) 
          {
            if (li.get(li.size()-1) != arr2[j])
              li.add(arr2[j]);
            j++;
          }
          return li;
    } 
    public static void disp(ArrayList <Integer> li){
        for(int i=0; i<li.size(); i++){
            System.out.print(li.get(i) + " ");
        }
    }
}
