public class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;   // ways(1)
        int second = 2;  // ways(2)
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = first + second;  // ways(n) = ways(n-1) + ways(n-2)
            first = second;
            second = result;
        }

        return result;
    }
}
