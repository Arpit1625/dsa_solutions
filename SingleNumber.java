public class SingleNumber {
    public static void main(String[] args) {
        int []arr = {4,1,2,1,2};
        System.out.println(findSingleNumber(arr));
    }
    static int findSingleNumber(int []nums){
        int singleno= nums[0];
        for(int i=1; i<nums.length ; i++){
            singleno =  singleno ^ nums[i];
        }
            return singleno;
    }
}
