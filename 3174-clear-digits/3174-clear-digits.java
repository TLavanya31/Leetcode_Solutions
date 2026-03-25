class Solution {
    public String clearDigits(String s) {
        String ans = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch >= '0' && ch <= '9') {
                if (ans.length() > 0) {
                    ans = ans.substring(0, ans.length() - 1);
                }
            } else {
                ans = ans + ch;
            }
        }
        return ans;
    }
}