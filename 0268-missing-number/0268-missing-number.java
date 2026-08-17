class Solution {
    public int missingNumber(int[] nums) 
    {
      int actual = 0 , expected = 0 ;
      int n = nums.length;
      
      expected =  n * (n + 1) / 2 ;

      for(int nu : nums)
      {
        actual += nu;
      }
       return expected - actual ;
    }
   
}