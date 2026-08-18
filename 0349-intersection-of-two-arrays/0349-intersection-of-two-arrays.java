class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
      HashSet<Integer> set = new HashSet<>();
      List<Integer> answer = new ArrayList<>();

      for(int i : nums1)
      {
       set.add(i);
      }

      for(int j : nums2)
      {
        if(set.contains(j) && !answer.contains(j))
        {
            answer.add(j);
        }
      } 
      int[] result = new int[answer.size()];
      for(int i=0 ; i<answer.size() ; i++)
      {
        result[i] = answer.get(i);
      }
      return result; 
    }
}