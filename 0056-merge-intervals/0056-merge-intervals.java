class Solution {
    public int[][] merge(int[][] intervals) {
        int n= intervals.length;
        int m= intervals[0].length;
        if(n<=1){
            return intervals;
        }
        ArrayList<int[]> pre = new ArrayList<>();
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        
        pre.add(intervals[0]);
        for(int i=0; i<n; i++){
            int[] lastInterval = pre.get(pre.size()-1);
            int e1 = lastInterval[1];

            int s2 = intervals[i][0];
            int e2 = intervals[i][1];

            if(s2<=e1){
                lastInterval[1] = Math.max(e1,e2);
            }

            else pre.add(intervals[i]);
        }

        return pre.toArray(new int[pre.size()][]);

    }
}