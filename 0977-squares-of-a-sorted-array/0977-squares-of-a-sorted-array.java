class Solution {
    public int[] sortedSquares(int[] nums) 
    {
      int[] arr = new int[nums.length];
      for(int i=0 ; i<nums.length ; i++)
      {
        int a = nums[i] * nums[i];
        arr[i] = a ;
      }
      Arrays.sort(arr);
        return arr;
    }
  
}