public class Searchinsertionpos {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 5;
    }
    static int Search_insertion_position(int nums[],int target){
        if(target<nums[0]){
            return 0;
        }
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        int min =0;
        int max = nums.length-1;
        while(min <= max){
            int mid = (min+max)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] <= target){
                min = mid+1;
            }
            else max = mid - 1;
        }
        return 0;
    }
}
