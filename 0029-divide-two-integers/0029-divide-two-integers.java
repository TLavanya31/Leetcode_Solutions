class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;

        while (n >= d) {
            int shift = 0;
            while (n >= (d << shift)) shift++;
            n -= d << (shift - 1);
            ans += 1 << (shift - 1);
        }

        return sign * ans;
    }
}