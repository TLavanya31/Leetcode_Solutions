class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n + 1];
        arr[0]=0;
        for (int itr = 1; itr <= n; itr++) {
            if(itr%2!=0){
                arr[itr]=arr[itr/2]+1;
            }
            else{
                arr[itr] =arr[itr/2];
            }
        }
        return arr;
    }
}