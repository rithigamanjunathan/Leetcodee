class Solution {
    public int[] productExceptSelf(int[] nums)
    {
      int[] result = new int[nums.length];
      int left_Product = 1;
      for(int i=0 ; i<nums.length ; i++)
      {
        result[i] = left_Product;
        left_Product = left_Product * nums[i];
      }
      int right_Product = 1;
      for(int i= nums.length-1 ; i>=0 ; i--)
      {
        result[i] = result[i] * right_Product ;
        right_Product = right_Product * nums[i];
      }
      return result;
    }
}