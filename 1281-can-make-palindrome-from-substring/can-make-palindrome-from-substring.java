class Solution {
    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        // prefix[i] holds a 26-bit mask of parities for s[0..i-1]
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int bit = 1 << (s.charAt(i) - 'a');
            prefix[i + 1] = prefix[i] ^ bit;
        }

        List<Boolean> ans = new ArrayList<>(queries.length);
        for (int[] q : queries) {
            int l = q[0], r = q[1], k = q[2];
            // mask of s[l..r]
            int mask = prefix[r + 1] ^ prefix[l];
            // count letters with odd occurrences
            int oddCount = Integer.bitCount(mask);
            // need oddCount/2 replacements to pair them up
            ans.add((oddCount / 2) <= k);
        }
        return ans;   
    }
}