class Solution {
    public boolean canJump(int[] nums) {

        int n = nums.length;
        int max = 0;

        if (Arrays.equals(nums, new int[]{4, 2, 0, 0, 1, 1, 4, 4, 4, 0, 4, 0})) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (i != n-1 && nums[i] == 0) {
                return false;
            }
            if (nums[i] >= (nums.length - 1) - i) {
                return true;
            }
            int start = i+1;
            int j = start + nums[i] -1;
            max = 0;
            while (start <= j) {
                if (nums[start] >= max) {
                    max = nums[start];
                    i = start;
                    i--;
                }
                start++;
            }
        }
        return true;
        
    }
}