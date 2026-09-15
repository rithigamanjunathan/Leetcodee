class Solution {
    public int firstMissingPositive(int[] nums)
    {
     HashSet<Integer> set = new HashSet<Integer>();
     int miss = 1;
     for(int i=0 ; i<nums.length;i++)
     {
       set.add(nums[i]);
     }
      for(int i=0 ; i<nums.length;i++)
      {
        if(set.contains(miss))
        {
           miss ++;
        }
      }
    return miss;   
    }   
}