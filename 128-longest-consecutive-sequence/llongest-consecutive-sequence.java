class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int ans1=0;

        for(int a:ans){
            if(!ans.contains(a-1)){
                int counter=1;
                while(ans.contains(a+1)){
                    counter++;
                    a++;
                }
                ans1 = Math.max(ans1,counter);
            }
        }
        return ans1;
    }
}