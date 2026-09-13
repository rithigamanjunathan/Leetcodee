class Solution {
    public int[] getAverages(int[] nums, int k) 
    {
      int n = nums.length ; 
      int[] result = new int[n];
      Arrays.fill(result,-1);
      int window_size = 2 * k +1;
      if(window_size > n )
      return result;
      long sum = 0;

      for(int i=0 ; i<window_size ; i++)
      {
       sum +=nums[i];
      }

      for(int i=k ; i<n-k ; i++)
      {
        result[i] = (int) (sum/window_size);
        sum-=nums[i-k];
          if (i + k + 1 < n) {
                sum += nums[i + k + 1];
      }
    }
    return result;
}}