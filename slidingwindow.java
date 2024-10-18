public class slidingwindow {
    public static void main (String args[]){
        int arr[] ={2,7,11,15};
        int start=0,end=0,sum=0,max = arr[0],k=2;
        while(end<arr.length){
            sum = sum+arr[end];
            if(end-start+1 < k){
                end ++;
            }
            else{
                max =Math.max(max, sum);
                sum=sum-arr[start];
                start++;
                end++;
            }
        }
        System.out.println(max);
    }
}
