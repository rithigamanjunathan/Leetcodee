class Solution {
    public int[][] merge(int[][] intervals) 
    {
     Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
     int[][] result = new int[intervals.length][2];
     int k=0;
     result[0] = intervals[0];
     for(int i=1 ; i<intervals.length ; i++)
     {
        if(intervals[i][0] <= result[k][1] )
        {
            result[k][1] = Math.max(result[k][1] , intervals[i][1]);
        }
        else
        {
            k++;
            result[k] = intervals[i];
        } 
     }
     return Arrays.copyOf(result,k+1);
    }
}