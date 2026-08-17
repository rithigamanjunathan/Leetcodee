class Solution {
    public int[] findErrorNums(int[] nums) 
    {
      int duplicate = 0;
      HashSet<Integer> d = new HashSet<>();
      for(int num : nums)
      {
        if(d.contains(num))
        {
           duplicate = num ;
        }
        else
        {
            d.add(num);
        }
      }
      int n=nums.length ;
      int expected_sum = 0 ,actual_sum = 0;
      
        expected_sum = n*(n+1) / 2 ;
      
      for(int nn : nums)
      {
        actual_sum += nn ;
      }
      int corr = actual_sum - duplicate;

 return new int[] { duplicate, expected_sum - corr} ;
    }
   
}
