class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Second - Commit
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int newKey = target - nums[i];
            if(seen.containsKey(newKey)) {
                return new int[] { i, seen.get(newKey)};
            }
            seen.put(nums[i],i);
        }
        return new int[] {};
    }
}