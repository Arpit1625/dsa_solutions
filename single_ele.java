public class single_ele {
    public static void main (String args[]){
     int arr []={1,1,2,3,3,4,4,8,8};
       // brute force 
       for(int i=0; i< arr.length-1; i++){
         int j=i+1;
         if(arr[i]==arr[j]){
            i++;
         }
         else{
            System.out.println(arr[i]);
         }
       }
    }
}
