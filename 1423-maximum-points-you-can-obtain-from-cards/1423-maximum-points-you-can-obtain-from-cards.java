class Solution {
    public int maxScore(int[] cardPoints, int k) 
    {
     int sum = 0;
     int  n = cardPoints.length ;
     int lf = n - k;
     int total=0;
     for(int i=0 ; i<n ; i++)
     {
       total += cardPoints[i] ;
     }
     for(int i=0 ; i<lf ; i++)
     {
        sum+=cardPoints[i];
     }   
     int min = sum ;
     for(int i=lf ; i<n ; i++)
     {
        sum+=(cardPoints[i]-cardPoints[i-lf]);
        min = Math.min(min,sum) ;
     } 
     min = total - min ;
     return min ;
    }
}