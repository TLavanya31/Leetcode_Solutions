class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else { 
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    if (open > 0) {
                        open--; 
                    } else {
                        insertions++;
                    }
                    i++; 
                } else {
                    if (open > 0) {
                        open--; 
                        insertions++; 
                    } else {
                        insertions += 2;
                    }
                }
            }
        }
        insertions += open * 2;
        return insertions;
    }
}
