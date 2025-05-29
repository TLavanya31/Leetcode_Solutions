class Solution {
    public int calculate(String s) {
           return evaluate(s, new int[]{0});
    }
    private int evaluate(String s, int[] index) 
    {
        int result = 0;
        int num = 0;
        int sign = 1;
        
        while (index[0] < s.length()) {
            char ch = s.charAt(index[0]++);
            
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            } else if (ch == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            } else if (ch == '(') {
                result += sign * evaluate(s, index);
                num = 0;
            } else if (ch == ')') {
                result += sign * num;
                return result;
            }
        }
        return result + (sign * num);
    }
}