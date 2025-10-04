class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> track = new HashMap<>();
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!track.containsKey(s.charAt(right))) {
                track.put(s.charAt(right), right);
                ans = Math.max(ans, right - left + 1);
            } else {
                left = Math.max(left,track.get(s.charAt(right))+1);
                track.put(s.charAt(right), right);
                ans = Math.max(ans, right - left + 1);
            }
        }
        return ans;
    }
}
