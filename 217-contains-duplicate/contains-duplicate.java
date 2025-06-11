class Solution {
    public boolean containsDuplicate(int[] nums) {
        //question - 217
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(nums[i]) && seen.get(nums[i])>=1){
                return true;
            }
            seen.put(nums[i], seen.getOrDefault(nums[i],0)+1);
        }
        return false;
    }
}