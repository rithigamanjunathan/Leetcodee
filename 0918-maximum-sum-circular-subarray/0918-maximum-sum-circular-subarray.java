class Solution {
    public int maxSubarraySumCircular(int[] nums) 
    {
      int total = 0;
      int maxsum = nums[0] ; int minsub = nums[0];
      int curmax =0, curmin = 0;
     for(int i=0 ; i<nums.length ; i++)
    { 
        total += nums[i];   
        curmin = Math.min(nums[i],curmin+nums[i]);
        minsub = Math.min(minsub,curmin);     
       
        curmax = Math.max(nums[i],curmax+nums[i]);
        maxsum = Math.max(maxsum , curmax);
    }
     if(maxsum  <  0) return maxsum;
     return Math.max(maxsum , total-minsub);
    }
}