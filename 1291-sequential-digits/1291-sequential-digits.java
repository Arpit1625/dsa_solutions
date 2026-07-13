class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 9; ++i) {
            int x = i;
            for (int j = i + 1; j < 10; ++j) {
                x = x * 10 + j;
                if (x >= low && x <= high) {
                    li.add(x);
                }
            }
        }
        Collections.sort(li);
        return li;
    }
}