import java.util.Stack;

public class LargestRectangularArea {
    public static void main(String[] args) {
        int [] arr = {60, 20, 50, 40, 10, 50, 60};
        System.out.println(getMaxArea(arr));
    }
    static int getMaxArea(int arr[]){
        int max = 0;
        Stack <Integer> st = new Stack<>();
        for(int i =0; i<= arr.length; i++){
            while(!st.empty() && (i==arr.length || arr[st.peek()] >= arr[i])){
                int h = arr[st.peek()];
                st.pop();
                int width;
                if(st.empty()){
                    width = i;
                }
                else{
                    width = i-st.peek()-1;
                }
                max = Math.max(max,width*h);
            }
            st.push(i);
        }
        return max;
    }
}
