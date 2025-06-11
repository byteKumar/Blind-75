class Solution {
    public int[] productExceptSelf(int[] nums) {
        //question - 238
        int[] ans1 = new int[nums.length];
        int[] ans2 = new int[nums.length];
        int[] ans3 = new int[nums.length];
        ans1[0]=nums[0];
        ans2[nums.length-1]=nums[nums.length - 1];
        for(int i=1;i<nums.length;i++){
            ans1[i]=nums[i]*ans1[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            ans2[i]=nums[i]*ans2[i+1];
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                ans3[i]=ans2[i+1];
            } else if(i==nums.length - 1) {
                ans3[i]=ans1[i-1];
            } else {
                ans3[i]=ans2[i+1]*ans1[i-1];
            }
        }

        return ans3;
    }
}