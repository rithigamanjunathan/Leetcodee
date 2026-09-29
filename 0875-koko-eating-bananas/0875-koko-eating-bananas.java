class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
      int left = 1; int right = 0;
      for(int i  : piles)
      {
       right = Math.max(right,i);
      }     
 
      while(left<right)
      {
        int mid = left + (right-left)/2 ;
        int hrs = 0;
        for(int pile : piles)
        {
          hrs += (pile+mid-1)/mid ;
        }
        if(hrs <= h ) right = mid ;
        else left = mid+1;
      }
      return left;
    }

}