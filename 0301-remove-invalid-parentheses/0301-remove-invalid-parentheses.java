class Solution {
    public List<String> removeInvalidParentheses(String str) {
        List<String> result = new ArrayList<>();
        Set<String> st = new HashSet<>();
        int open = 0, close = 0;
        for (char c : str.toCharArray()) {
            if (c == '(')
                open++;
            else if (c == ')') {
                if (open != 0)
                    open--;
                else
                    close++;
            }
        }
        findValid(str, 0, open, close, 0, "", result, st);
        Collections.sort(result);
        return result;
    }

    void findValid(String str, int index, int open, int close, int pair, String cur, List<String> res, Set<String> st) {
        if (index == str.length()) {
            if (open == 0 && close == 0 && pair == 0) {
                if (!st.contains(cur)) {
                    res.add(cur);
                    st.add(cur);
                }
            }

            return;
        }
        if (str.charAt(index) != '('
                && str.charAt(index) != ')') {
            findValid(str, index + 1, open, close, pair, cur + str.charAt(index), res, st);
        } else {
            if (str.charAt(index) == '(') {
                if (open > 0) {
                    findValid(str, index + 1, open - 1, close, pair, cur, res, st);
                }

                findValid(str, index + 1, open, close, pair + 1, cur + str.charAt(index), res, st);
            } else {
                if (close > 0) {
                    findValid(str, index + 1, open, close - 1, pair, cur, res, st);
                }
                if (pair > 0) {
                    findValid(str, index + 1, open, close,
                            pair - 1,
                            cur + str.charAt(index), res,
                            st);
                }
            }
        }
    }
}