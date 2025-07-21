class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            ans.append(s.charAt(i));
        }
        for(int i = 0; i < indices.length; i++){
            ans.setCharAt(indices[i],s.charAt(i));
        }
        return ans.toString();
    }
}