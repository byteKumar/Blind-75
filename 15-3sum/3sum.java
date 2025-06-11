class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        int start=0;
        int end=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-1;i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            start=i+1;
            end=nums.length-1;
            while(start<end){
                
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    List<Integer> aa=new ArrayList<>();
                    aa.add(nums[i]);
                    aa.add(nums[start]);
                    aa.add(nums[end]);
                    ans.add(aa);
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                } else if(sum<0){
                    start++;
                } else {
                    end--;
                }
            }
        }
        return ans;
        
    }
}