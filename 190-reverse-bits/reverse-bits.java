class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        int bit = 31;
        int i=1;
        for(int j=0;j<32;j++){
            if((n&i)!=0){
                ans += 1<<bit;
            }
            bit--;
            i=i<<1;
        }
        return ans;
    }
}