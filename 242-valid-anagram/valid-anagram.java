class Solution {
    public boolean isAnagram(String s, String t) {
        //question - 242
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> seen = new HashMap<>();
        HashMap<Character, Integer> seen1 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            seen.put(s.charAt(i), seen.getOrDefault(s.charAt(i),0)+1);
            seen1.put(t.charAt(i), seen1.getOrDefault(t.charAt(i),0)+1);
        }

        return seen.equals(seen1);
    }
}