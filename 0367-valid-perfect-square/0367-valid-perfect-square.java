class Solution {
    public boolean isPerfectSquare(int num1) {
        long low = 1;
        long high = num1;
        long num = (long)num1;
        while(low <= high){
            long mid = (low + high)/2;
            long sqr = mid * mid ;
            if(sqr == num){
                return true;
            } else if(sqr > num){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return false;
    }
}