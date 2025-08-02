class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        int [] prefix = new int[n+1];
        for(int i=0;i<n;i++){
            int bit = 1 << (s.charAt(i) - 'a');
            prefix[i+1] = prefix[i]^bit;
        }
        
        List<Boolean> ans = new ArrayList<>(queries.length);
        for(int[] q:queries){
            int l=q[0], r=q[1], k=q[2];
            int mask = prefix[r+1]^prefix[l];
            int count = Integer.bitCount(mask);
            ans.add((count/2)<=k);
        }

        return ans;
    }
}