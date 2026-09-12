class Solution {
    public int findMinArrowShots(int[][] points) 
    {
      Arrays.sort(points,(a,b)-> Integer.compare(a[0],b[0]));
      int[][] result = new int[points.length][2];
      int k=0;
      result[0] = points[0];
      for(int i=1 ; i<points.length ; i++)
      {
       if(points[i][0]<=result[k][1])
       {
          result[k][1] = Math.min(result[k][1] , points[i][1]);
       }
       else
       {
         k++;
            result[k] = points[i];
       }
      } 
       return k+1;  
    }
}