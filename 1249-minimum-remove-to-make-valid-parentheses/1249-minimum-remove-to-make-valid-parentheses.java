class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder str = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                open++;
                str.append(c);
            }

            else if (c == ')') {
                if (open > 0) {
                    open--;
                    str.append(c);
                }
            }

            else str.append(c);
        }
        for (int i = str.length() - 1; i >= 0 && open > 0; i--) {
            if (str.charAt(i) == '(') {
                str.deleteCharAt(i);
                open--;
            }
        }

        return str.toString();
    }
}