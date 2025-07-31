class Solution {
    public int maxArea(int[] height) {
        int maxAns = 0;
        int start = 0;
        int end = height.length - 1;
        maxAns = (height[start]<height[end]) ? (height[start] * (height.length - 1)) : (height[end] * (height.length - 1));
        if(height[start]<height[end]) {
            start++;
        } else {
            end--;
        }
        while(start<=end) {
            int tempAns = 0;
            if(height[start]<height[end]) {
                tempAns = (height[start] * (end - start));
                start++;
            } else {
                tempAns = (height[end] * (end - start));
                end--;
            }

            if(tempAns > maxAns) {
                maxAns = tempAns;
            }
        }
        return maxAns;
    }
}