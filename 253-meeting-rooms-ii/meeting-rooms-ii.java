class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] one = new int[n];
        int[] two = new int[n];

        for(int i=0;i<n;i++){
            one[i]=intervals[i][0];
            two[i]=intervals[i][1];
        }

        Arrays.sort(one);
        Arrays.sort(two);

        int maxRoom = 0;
        int firstPt = 0;
        int secondpt = 0;
        int res = 0;

        while(firstPt < n){
            if(one[firstPt]<two[secondpt]){
                maxRoom++;
                firstPt++;
            } else {
                maxRoom--;
                secondpt++;
            }
            res = Math.max(res, maxRoom);
        }
        return res;
    }
}