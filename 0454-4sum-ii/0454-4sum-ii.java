class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) 
    {
      HashMap<Integer,Integer> map = new HashMap<>();
      int sum1,sum2;
      for(int i : nums1)
      {
       for(int j : nums2)
       {
        sum1= i + j ;
        map.put(sum1,map.getOrDefault(sum1,0)+1);
       }
      }
      int count = 0;
      for(int k : nums3)
      {
        for(int l : nums4)
        {
            sum2 = k+l;
            count+=map.getOrDefault(-sum2,0);
        }
      }  
      return count;
    }
}