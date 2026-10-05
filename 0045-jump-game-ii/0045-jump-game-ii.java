class Solution {
    public int jump(int[] nums) 
    {
      int jump = 0,current_end =0,farthest = 0;
      for(int i=0 ; i<nums.length-1 ; i++)
      {
        farthest = Math.max(farthest,nums[i]+i);
        if(i==current_end)
      {
        jump++;
        current_end = farthest;
      } 
    }
      return jump;
    }
}