class Solution {
    public int pivotIndex(int[] nums) 
    {
       int n= nums.length ;
       int t=0;
       int left=0 ;
       for(int i=0 ; i<n ; i++)
       {
        t+=nums[i];
       }
       for(int i=0 ; i<n ; i++)
       {
        int right = t-left-nums[i];
       if(left==right)
       {
        return i;
       }
       else
       {
        left+=nums[i];
       }
      
    }
     return-1;
}
}