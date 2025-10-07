class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int right = 0;
        int maxF = 0;
        int maxL = 0;
        int[] hash = new int[26];

        while (right < s.length()) {
            hash[s.charAt(right)-'A']++;
            maxF = Math.max(maxF, hash[s.charAt(right)-'A']);

            if ((right - left + 1) - maxF > k) {
                hash[s.charAt(left) - 'A']--;
                left = left + 1;
                maxF = 0;
            }

            if ((right - left + 1) - maxF <= k) {
                maxL = Math.max(maxL, right - left + 1);
            }
            right++;
        }
        return maxL;
    }
}
