class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
      HashSet<Integer> set = new HashSet<>();
      List<Integer> list = new ArrayList<>();
      int c = 1;
      for(int i=0 ; i<nums.length ; i++)
      {
        set.add(nums[i]);
      }
       for(int i=0 ; i<nums.length ; i++)
       {
        if(!set.contains(c))
        {
            list.add(c);
        }
        c++;
      }
      return list;
    }
}