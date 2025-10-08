class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> p = new PriorityQueue();

        for(int[] interval : intervals) {
            if(p.isEmpty()){
                p.add(interval[1]);
                continue;
            }

            if (p.peek()<=interval[0]){
                p.remove();
            }

            p.add(interval[1]);
        }
        return p.size();
    }
}