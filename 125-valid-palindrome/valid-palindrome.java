class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int start=0;

        StringBuilder ss = new StringBuilder();
        for(int i=0;i<n;i++){
            if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9')){
                if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
                    ss.append((char)(s.charAt(i)+32));
                } else {
                    ss.append(s.charAt(i));
                }
            }
        }

        int end = ss.length() - 1;

        while(start<end) {
            if(ss.charAt(start)!=ss.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}