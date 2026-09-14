class Solution {
    public int removeCoveredIntervals(int[][] intervals) 
    {
     Arrays.sort(intervals,(a,b)->{if(a[0] == b[0])
     return Integer.compare(b[1],a[1]);
     return Integer.compare(a[0],b[0]);});
     int[] end = intervals[0];
     int count = 1;
     for (int i=1; i<intervals.length ;i++)
     {
     if(end[1] >= intervals[i][1])
     {
        continue;
     }
      count++;
     end = intervals[i];
    }
       return count; 
    }
}