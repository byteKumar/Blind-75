class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int[] newI = new int[2];
        newI[0] = intervals[0][0];
        newI[1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (newI[1] < interval[0]) {
                ans.add(newI);
                // newI[0] = interval[0];
                // newI[1] = interval[1];
                newI = new int[]{interval[0], interval[1]};
            }
            else {
                newI[0] = Math.min(interval[0], newI[0]);
                newI[1] = Math.max(interval[1], newI[1]);
            }
        }
        if (newI != null) {
            ans.add(newI);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}